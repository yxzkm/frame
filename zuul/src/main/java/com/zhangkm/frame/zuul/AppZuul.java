package com.zhangkm.frame.zuul;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.support.SpringMvcContract;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.netflix.zuul.context.RequestContext;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import net.sf.json.JSONObject;

@SpringBootApplication
@EnableFeignClients
@EnableZuulProxy
public class AppZuul extends WebMvcConfigurerAdapter{

    private Logger logger = LoggerFactory.getLogger(this.getClass());
            
    public static void main(String[] args) {
        SpringApplication.run(AppZuul.class, args);
    } 
    
    public static void main111111(String[] args) {
        Map<String,Object> reqMap = new HashMap<String,Object>();
        reqMap.put("uname", "13388888888");
        reqMap.put("pwd", "123456");
        JSONObject jsonObject = JSONObject.fromObject(reqMap);

        GitHub github = Feign.builder()
                .contract(new SpringMvcContract())
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(GitHub.class, "http://localhost:8088");

        // Fetch and print a list of the contributors to this library.
        Map<String,Object> map = github.login(jsonObject.toString());
        System.out.println(jsonObject.toString());
    }


}