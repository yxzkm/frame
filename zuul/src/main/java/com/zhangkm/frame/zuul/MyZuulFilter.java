package com.zhangkm.frame.zuul;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.support.SpringMvcContract;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import net.sf.json.JSONObject;

@Component
public class MyZuulFilter extends ZuulFilter{

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        
        logger.info("[进入API网关过滤器][{}][{}]", request.getMethod(), request.getRequestURL().toString());
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            logger.error("[进入API网关过滤器][没有token，拒绝访问]");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){}

            return null;
        }

        Map<String,Object> reqMap = new HashMap<String,Object>();
        reqMap.put("uname", "13388888888");
        reqMap.put("pwd", "123456");
        GitHub github = Feign.builder()
                .contract(new SpringMvcContract())
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(GitHub.class, "http://localhost:8088");
        JSONObject jsonObject = JSONObject.fromObject(reqMap);

        // Fetch and print a list of the contributors to this library.
        Map<String,Object> map = github.login(jsonObject.toString());
        logger.info("[进入API网关过滤器][从token获取用户登录信息成功map]{}",map.toString());
        
        jsonObject = net.sf.json.JSONObject.fromObject(map);
        logger.info("[进入API网关过滤器][从token获取用户登录信息成功json]{}",jsonObject.toString());

        byte[] bytes = null;
        try {
            bytes = jsonObject.toString().getBytes("utf-8");
        }catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        @SuppressWarnings("restriction")
        String base64 = new sun.misc.BASE64Encoder().encode(bytes);
        base64 = base64.replaceAll("\r|\n", "");
        logger.info("[进入API网关过滤器][将用户登录信息base64（去除回车换行）]{}",base64);
        ctx.addZuulRequestHeader("loginInfo", base64);
        logger.info("[进入API网关过滤器][将base64放入http头部：loginInfo]");
        return null;
    }
}
