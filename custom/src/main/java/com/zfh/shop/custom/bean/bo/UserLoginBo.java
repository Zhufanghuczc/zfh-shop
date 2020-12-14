package com.zfh.shop.custom.bean.bo;

import java.sql.Date;

/**
 * 用户 登录 业务模型对象
 * */
public class UserLoginBo {

    private String login_name;
    private String user_password;
    private String user_salt;       // 密码盐值
    private String user_name;
    private String user_avatarurl;  // 客户头像
    private Integer user_securitylevel; // 安全等级
    private String user_token;
    private Date user_expiretiome;
    private Integer user_gender;
    private Date user_birthday;
    private String user_region;
    private String user_motto;
    private Byte user_status;
    private Date user_loggedtime;
    private String user_loggedip;
    private Integer user_createfrom;
    private Date createtime;
    private Date updatetime;

}
