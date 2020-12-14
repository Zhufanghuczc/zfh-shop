package com.zfh.shop.custom.bean.po;

import java.util.Date;

/**
 * 用户收件信息 资源
 * */
public class UserAddress {

    private Integer id;
    private String  uaddr_name;
    private String  uaddr_phone;
    private String  uaddr_province;
    private String  uaddr_city;
    private String  uaddr_district;
    private String  uaddr_address;
    private String  uaddr_label;
    private Date    createtime;
    private Date    updatetime;
    private Integer uaddr_user_id;

    // getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUaddr_name() {
        return uaddr_name;
    }

    public void setUaddr_name(String uaddr_name) {
        this.uaddr_name = uaddr_name;
    }

    public String getUaddr_phone() {
        return uaddr_phone;
    }

    public void setUaddr_phone(String uaddr_phone) {
        this.uaddr_phone = uaddr_phone;
    }

    public String getUaddr_province() {
        return uaddr_province;
    }

    public void setUaddr_province(String uaddr_province) {
        this.uaddr_province = uaddr_province;
    }

    public String getUaddr_city() {
        return uaddr_city;
    }

    public void setUaddr_city(String uaddr_city) {
        this.uaddr_city = uaddr_city;
    }

    public String getUaddr_district() {
        return uaddr_district;
    }

    public void setUaddr_district(String uaddr_district) {
        this.uaddr_district = uaddr_district;
    }

    public String getUaddr_address() {
        return uaddr_address;
    }

    public void setUaddr_address(String uaddr_address) {
        this.uaddr_address = uaddr_address;
    }

    public String getUaddr_label() {
        return uaddr_label;
    }

    public void setUaddr_label(String uaddr_label) {
        this.uaddr_label = uaddr_label;
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

    public Integer getUaddr_user_id() {
        return uaddr_user_id;
    }

    public void setUaddr_user_id(Integer uaddr_user_id) {
        this.uaddr_user_id = uaddr_user_id;
    }
}
