package com.zfh.shop.product.bean.po;

import java.sql.Date;

/**
 * Spu 商品
 * */
public class Spu {

    private Integer id;                 // 商品id
    private String spu_name;            // 商品名称
    private String spu_title;           // 商品标题
    private String spu_thumburl;        // 商品封面图片
    private Double spu_price;           // 商品起价
    private String spu_introduction;    // 商品介绍
    private Integer spu_stock;          // 商品库存
    private Integer spu_warningstock;   // 商品预警库存
    private Integer spu_maxbuy;         // 限购数量
    private String spu_unit;            // 商品单位
    private Byte spu_status;            // 商品状态  0.上架 1.下架
    private Date createtime;            // 商品创建时间
    private Date updatetime;            // 商品最后更新时间
    private Integer spu_brand_id;       // 商品品牌编号
    private Integer spu_category_id;    // 商品分类编号

    // getters and  setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpu_name() {
        return spu_name;
    }

    public void setSpu_name(String spu_name) {
        this.spu_name = spu_name;
    }

    public String getSpu_title() {
        return spu_title;
    }

    public void setSpu_title(String spu_title) {
        this.spu_title = spu_title;
    }

    public String getSpu_thumburl() {
        return spu_thumburl;
    }

    public void setSpu_thumburl(String spu_thumburl) {
        this.spu_thumburl = spu_thumburl;
    }

    public Double getSpu_price() {
        return spu_price;
    }

    public void setSpu_price(Double spu_price) {
        this.spu_price = spu_price;
    }

    public String getSpu_introduction() {
        return spu_introduction;
    }

    public void setSpu_introduction(String spu_introduction) {
        this.spu_introduction = spu_introduction;
    }

    public Integer getSpu_stock() {
        return spu_stock;
    }

    public void setSpu_stock(Integer spu_stock) {
        this.spu_stock = spu_stock;
    }

    public Integer getSpu_warningstock() {
        return spu_warningstock;
    }

    public void setSpu_warningstock(Integer spu_warningstock) {
        this.spu_warningstock = spu_warningstock;
    }

    public Integer getSpu_maxbuy() {
        return spu_maxbuy;
    }

    public void setSpu_maxbuy(Integer spu_maxbuy) {
        this.spu_maxbuy = spu_maxbuy;
    }

    public String getSpu_unit() {
        return spu_unit;
    }

    public void setSpu_unit(String spu_unit) {
        this.spu_unit = spu_unit;
    }

    public Byte getSpu_status() {
        return spu_status;
    }

    public void setSpu_status(Byte spu_status) {
        this.spu_status = spu_status;
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

    public Integer getSpu_brand_id() {
        return spu_brand_id;
    }

    public void setSpu_brand_id(Integer spu_brand_id) {
        this.spu_brand_id = spu_brand_id;
    }

    public Integer getSpu_category_id() {
        return spu_category_id;
    }

    public void setSpu_category_id(Integer spu_category_id) {
        this.spu_category_id = spu_category_id;
    }
}
