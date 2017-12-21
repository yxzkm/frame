package com.zhangkm.microservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/common", method = RequestMethod.GET)
public class CommonController {

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getList(HttpServletRequest req,HttpServletResponse resp) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("mobile", "13366036677");
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
        return ret;
    }

}
