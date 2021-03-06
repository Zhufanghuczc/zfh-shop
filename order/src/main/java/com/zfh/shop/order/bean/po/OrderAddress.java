package com.zfh.shop.order.bean.po;

import java.sql.Date;

/**
 * 订单收货信息
 * */
public class OrderAddress {

    private Integer id;         // 收获信息 id
    private String orderNo;     // 关联的订单编号
    private String consignee;   // 收货人姓名
    private String phone;       // 收货人联系电话
    private String province;    // 收货地址 省份
    private String city;        // 收货地址 城市
    private String district;    // 收货地址 区、县
    private String address;     // 收货地址 详细地址
    private Date updateTime;    // 更新时间

    // getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
