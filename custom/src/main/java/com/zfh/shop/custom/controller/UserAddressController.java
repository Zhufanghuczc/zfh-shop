package com.zfh.shop.custom.controller;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.zfh.shop.custom.bean.po.UserAddress;
import com.zfh.shop.custom.service.IUserAddressService;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 用户收货信息 资源 Controller
 * */
@RestController
public class UserAddressController {

    // 依赖的业务逻辑层
    @Resource
    private IUserAddressService userAddressService;


    // 当前用户的 收货信息列表
    @RequestMapping(value = "/useraddress" , method = RequestMethod.GET)
    public Object getUserAddressList(@RequestHeader String token){

        // 获取当前请求报文头中的 token
        DecodedJWT jwt = JWT.decode(token);

        return userAddressService.getUserAddressByUserId(Integer.parseInt(jwt.getAudience().get(0)));
    }

    // 添加收货信息
    @RequestMapping(value = "/useraddress" , method = RequestMethod.POST)
    public Object addUserAddress(@RequestHeader String token , UserAddress userAddress){

        DecodedJWT jwt = JWT.decode(token);
        Integer user_id = Integer.parseInt(jwt.getAudience().get(0));

        userAddress.setCreatetime(new Date(System.currentTimeMillis()));
        userAddress.setUaddr_user_id(user_id);
        return userAddressService.addUserAddress(userAddress);
    }

    // 删除收货信息
    @RequestMapping(value = "/userAddress" , method = RequestMethod.DELETE)
    public Object deleteUserAddressById(Integer id){

        return userAddressService.deleteUserAddressById(id);
    }

    // 修改用户收货信息
    @RequestMapping(value = "/userAddress" , method = RequestMethod.PUT)
    public Object updateUserAddress(UserAddress userAddress){

        userAddress.setUpdatetime(new Date(System.currentTimeMillis()));
        return userAddressService.updateUserAddress(userAddress);
    }
}
