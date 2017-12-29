package com.zhangkm.microservice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/common", method = RequestMethod.GET)
public class CommonController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getList(HttpServletRequest request,HttpServletResponse resp,
            String para) {
        Enumeration<String> headerNames = request.getHeaderNames();
        String loginInfoString = "";
        while (headerNames.hasMoreElements()) {
            String key = headerNames.nextElement();
            String value = request.getHeader(key);
            logger.info("[Headers][{}][{}]",key,value);
            if("loginInfo".equalsIgnoreCase(key)){
                loginInfoString = value; 
                break;
            }
        }
        logger.info("[loginInfoString][{}]",loginInfoString);
        String base64 = "";
        try {
            byte[] bytes = new sun.misc.BASE64Decoder().decodeBuffer(loginInfoString.replaceAll("\r|\n", ""));
             base64 = new String(bytes,"utf-8");
            logger.info("[base64][{}]",base64);

        }
        catch (IOException e) {
            e.printStackTrace();
        }
                
        net.sf.json.JSONObject jsonObject = net.sf.json.JSONObject.fromObject(base64);
        logger.info("[jsonObject][{}]",jsonObject.toString());
        
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("mobile", "13366035578");
        map.put("realName", "李文涛");
        map.put("enterName", "宁波国华机械设备有限公司");
        Map<String,Object> map1 = new HashMap<String,Object>();
        map1.put("mobile", "13926036655");
        map1.put("realName", "黄国富");
        map1.put("enterName", "南京紫金食品加工厂");
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        list.add(map);
        list.add(map1);
        Map<String,Object> ret = new HashMap<String,Object>();
        ret.put("data", list);
        ret.put("errorCode", 0);
        ret.put("errorString", "正常");
        ret.put("para", para);
        return ret;
    }

}
