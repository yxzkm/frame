package com.zhangkm.auth;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.sf.json.JSONObject;

@RestController
@RequestMapping(value = "/")
public class AuthController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/sso/simpleLogin", method = RequestMethod.POST)
    @ResponseBody
    public ReturnData login(
            HttpServletRequest request,HttpServletResponse resp,
            @RequestBody Map<String,Object> reqMap
            //@RequestBody String reqMap
            ) {
        //JSONObject jsonObject = JSONObject.fromObject(reqMap);
        //logger.info("[jsonObject]{}",jsonObject.toString());
        logger.info("[mobile password]{},{}",reqMap.get("mobile"),reqMap.get("password"));
        logger.info("[String]{}",reqMap);
        ReturnData ret = new ReturnData(Code.OK);
        Map<String,Object> dataBody = new HashMap<String,Object>();
        dataBody.put("mobile", "13366035578");
        dataBody.put("realName", "李文涛");
        dataBody.put("enterName", "宁波国华机械设备有限公司");
        ret.setDataBody(dataBody);
        return ret;
    }

    @RequestMapping(value = "/ss", method = RequestMethod.GET)
    @ResponseBody
    public String ss(
            HttpServletRequest request,HttpServletResponse resp,
            String uname,String pwd) {
        logger.info("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        return "zhangkm login!";
    }

}
