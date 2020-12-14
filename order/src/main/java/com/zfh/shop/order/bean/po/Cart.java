package com.zfh.shop.order.bean.po;


import java.sql.Date;

/**
 * 购物车
 * */
public class Cart {

    private Integer id;
    private Integer cart_userid;
    private Integer cart_spuid;
    private String cart_name;
    private String cart_thumburl;
    private Double cart_price;
    private Integer cart_count;
    private Byte cart_checked;
    private Date createtime;
    private Date updatetime;
    private String cart_sku;

    // getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCart_userid() {
        return cart_userid;
    }

    public void setCart_userid(Integer cart_userid) {
        this.cart_userid = cart_userid;
    }

    public Integer getCart_spuid() {
        return cart_spuid;
    }

    public void setCart_spuid(Integer cart_spuid) {
        this.cart_spuid = cart_spuid;
    }

    public String getCart_name() {
        return cart_name;
    }

    public void setCart_name(String cart_name) {
        this.cart_name = cart_name;
    }

    public String getCart_thumburl() {
        return cart_thumburl;
    }

    public void setCart_thumburl(String cart_thumburl) {
        this.cart_thumburl = cart_thumburl;
    }

    public Double getCart_price() {
        return cart_price;
    }

    public void setCart_price(Double cart_price) {
        this.cart_price = cart_price;
    }

    public Integer getCart_count() {
        return cart_count;
    }

    public void setCart_count(Integer cart_count) {
        this.cart_count = cart_count;
    }

    public Byte getCart_checked() {
        return cart_checked;
    }

    public void setCart_checked(Byte cart_checked) {
        this.cart_checked = cart_checked;
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

    public String getCart_sku() {
        return cart_sku;
    }

    public void setCart_sku(String cart_sku) {
        this.cart_sku = cart_sku;
    }
}
