package com.zfh.shop.order.bean.po;


import java.sql.Date;

/**
 * 订单详情 资源 实体模型
 * */
public class OrderDetails {

    private Integer id;     // id
    private String odtails_name;        // 商品名称
    private String odtails_thumburl;    // 商品图片地址
    private Double odtails_price;       // 商品价格
    private Integer odtails_count;      // 商品数量
    private Double odtails_amount;      // 小计金额
    private Integer odtails_scorestatus;    // 评价状态 0.待评价 1.已评价
    private Double odtails_score;   // 商品评分
    private String odtails_comment; // 商品评论内容
    private String odtails_photourls;   // 分享的图片集合
    private Date createtime;        // 创建时间
    private Date updatetime;        // 更新时间
    private Integer odtails_orderno_id; // 关联的订单号
    private Integer odtails_sku_id; // 商品规格 id
    private Integer odtails_spu_id; // 商品 id

    // getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOdtails_name() {
        return odtails_name;
    }

    public void setOdtails_name(String odtails_name) {
        this.odtails_name = odtails_name;
    }

    public String getOdtails_thumburl() {
        return odtails_thumburl;
    }

    public void setOdtails_thumburl(String odtails_thumburl) {
        this.odtails_thumburl = odtails_thumburl;
    }

    public Double getOdtails_price() {
        return odtails_price;
    }

    public void setOdtails_price(Double odtails_price) {
        this.odtails_price = odtails_price;
    }

    public Integer getOdtails_count() {
        return odtails_count;
    }

    public void setOdtails_count(Integer odtails_count) {
        this.odtails_count = odtails_count;
    }

    public Double getOdtails_amount() {
        return odtails_amount;
    }

    public void setOdtails_amount(Double odtails_amount) {
        this.odtails_amount = odtails_amount;
    }

    public Integer getOdtails_scorestatus() {
        return odtails_scorestatus;
    }

    public void setOdtails_scorestatus(Integer odtails_scorestatus) {
        this.odtails_scorestatus = odtails_scorestatus;
    }

    public Double getOdtails_score() {
        return odtails_score;
    }

    public void setOdtails_score(Double odtails_score) {
        this.odtails_score = odtails_score;
    }

    public String getOdtails_comment() {
        return odtails_comment;
    }

    public void setOdtails_comment(String odtails_comment) {
        this.odtails_comment = odtails_comment;
    }

    public String getOdtails_photourls() {
        return odtails_photourls;
    }

    public void setOdtails_photourls(String odtails_photourls) {
        this.odtails_photourls = odtails_photourls;
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

    public Integer getOdtails_orderno_id() {
        return odtails_orderno_id;
    }

    public void setOdtails_orderno_id(Integer odtails_orderno_id) {
        this.odtails_orderno_id = odtails_orderno_id;
    }

    public Integer getOdtails_sku_id() {
        return odtails_sku_id;
    }

    public void setOdtails_sku_id(Integer odtails_sku_id) {
        this.odtails_sku_id = odtails_sku_id;
    }

    public Integer getOdtails_spu_id() {
        return odtails_spu_id;
    }

    public void setOdtails_spu_id(Integer odtails_spu_id) {
        this.odtails_spu_id = odtails_spu_id;
    }
}
