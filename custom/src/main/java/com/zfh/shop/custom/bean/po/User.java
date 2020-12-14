package com.zfh.shop.custom.bean.po;


import java.util.Date;

/**
 * 用户资源 实体模型对象
 * */
public class User {

    private Integer id;
    private String user_phone;
    private String user_email;
    private String user_password;
    private String user_salt;       // 密码盐值
    private String user_name;
    private String user_avatarurl;  // 客户头像
    private Integer user_securitylevel; // 安全等级
    private String user_token;
    private Date user_expiretime;
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

    // getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_salt() {
        return user_salt;
    }

    public void setUser_salt(String user_salt) {
        this.user_salt = user_salt;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_avatarurl() {
        return user_avatarurl;
    }

    public void setUser_avatarurl(String user_avatarurl) {
        this.user_avatarurl = user_avatarurl;
    }

    public Integer getUser_securitylevel() {
        return user_securitylevel;
    }

    public void setUser_securitylevel(Integer user_securitylevel) {
        this.user_securitylevel = user_securitylevel;
    }

    public String getUser_token() {
        return user_token;
    }

    public void setUser_token(String user_token) {
        this.user_token = user_token;
    }

    public Date getUser_expiretime() {
        return user_expiretime;
    }

    public void setUser_expiretime(Date user_expiretime) {
        this.user_expiretime = user_expiretime;
    }

    public Integer getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(Integer user_gender) {
        this.user_gender = user_gender;
    }

    public Date getUser_birthday() {
        return user_birthday;
    }

    public void setUser_birthday(Date user_birthday) {
        this.user_birthday = user_birthday;
    }

    public String getUser_region() {
        return user_region;
    }

    public void setUser_region(String user_region) {
        this.user_region = user_region;
    }

    public String getUser_motto() {
        return user_motto;
    }

    public void setUser_motto(String user_motto) {
        this.user_motto = user_motto;
    }

    public Byte getUser_status() {
        return user_status;
    }

    public void setUser_status(Byte user_status) {
        this.user_status = user_status;
    }

    public Date getUser_loggedtime() {
        return user_loggedtime;
    }

    public void setUser_loggedtime(Date user_loggedtime) {
        this.user_loggedtime = user_loggedtime;
    }

    public String getUser_loggedip() {
        return user_loggedip;
    }

    public void setUser_loggedip(String user_loggedip) {
        this.user_loggedip = user_loggedip;
    }

    public Integer getUser_createfrom() {
        return user_createfrom;
    }

    public void setUser_createfrom(Integer user_createfrom) {
        this.user_createfrom = user_createfrom;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
