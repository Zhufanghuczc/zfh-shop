package com.zfh.shop.custom.controller;

import com.zfh.shop.custom.bean.po.User;
import com.zfh.shop.custom.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    // 业务逻辑层
    @Resource
    private IUserService userService;

    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    public Object regist(User user){

        boolean result = userService.regist(user);
        Map<String,Object> map = new HashMap<>();
        map.put("result",result);
        return map;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object login( String username,String password ){
        User user = userService.login(username, password);
        return user;
    }

}
