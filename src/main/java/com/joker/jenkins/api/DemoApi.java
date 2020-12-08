package com.joker.jenkins.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lichenggang
 * @date 2020/12/9 上午12:43
 * @description
 */
@RestController
public class DemoApi {


    @GetMapping("/api/user/getUser")
    @ResponseBody
    public Object getUser() {
        Map<String, Object> map = new HashMap<>();
        map.put("id", -1L);
        map.put("username", "lcg");
        map.put("createTime", new Date());
        return map;
    }
}
