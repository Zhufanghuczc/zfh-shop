package com.zfh.shop.product.bean.vo;

import com.zfh.shop.product.bean.po.Brand;
import com.zfh.shop.product.bean.po.Category;
import com.zfh.shop.product.bean.po.Sku;
import com.zfh.shop.product.bean.po.SpuBanner;

import java.sql.Date;
import java.util.List;

/**
 * Spu 商品视图 模型
 * */
public class SpuVo {

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

    private Brand brand;       // 商品品牌
    private Category category;    // 商品分类

    private List<Sku> skuList;  // 商品规格列表
    private List<SpuBanner> spuBannerList;  // 商品相册列表

    // getters and setters
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

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Sku> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<Sku> skuList) {
        this.skuList = skuList;
    }

    public List<SpuBanner> getSpuBannerList() {
        return spuBannerList;
    }

    public void setSpuBannerList(List<SpuBanner> spuBannerList) {
        this.spuBannerList = spuBannerList;
    }
}
