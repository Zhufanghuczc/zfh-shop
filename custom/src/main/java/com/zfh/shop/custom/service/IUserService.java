package com.zfh.shop.custom.service;

import com.zfh.shop.custom.bean.po.User;

/**
 * User 用户资源 业务逻辑层接口
 * */
public interface IUserService {

    /**
     * 根据用户信息 注册用户
     * @param user 用户模型对象
     * @return 注册用户是否成功
     * */
    Boolean regist(User user );

    /**
     * 根据账户名，密码登录
     * @param username 登录用户名
     * @param password 账户密码
     * @return 用户对象
     * */
    User login(String username,String password);

}
