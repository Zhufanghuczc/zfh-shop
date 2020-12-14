package com.zfh.shop.product.bean.bo;

import java.util.List;

/**
 * Spu 搜索 业务模型对象
 * */
public class SpuSearchBo {

    private String spu_name;            // 商品名称
    private String spu_title;           // 商品标题
    private Double min_price;       // 商品起价
    private Double max_price;       // 商品顶价
    private String spu_introduction;    // 商品介绍
    private Byte spu_status;            // 商品状态  0.上架 1.下架
    private Integer spu_brand_id;       // 商品品牌编号
    private Integer spu_category_id;    // 商品分类编号
    private List<Integer> spu_attr_value_id;    // 商品属性值编号
    private String sort;    // 排序字段
    private String order;    // 排序方式
    private Integer start=0;  // 起始页
    private Integer length=10; // 查询记录

    // getters and setters

    public List<Integer> getSpu_attr_value_id() {
        return spu_attr_value_id;
    }

    public void setSpu_attr_value_id(List<Integer> spu_attr_value_id) {
        this.spu_attr_value_id = spu_attr_value_id;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
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

    public Double getMin_price() {
        return min_price;
    }

    public void setMin_price(Double min_price) {
        this.min_price = min_price;
    }

    public Double getMax_price() {
        return max_price;
    }

    public void setMax_price(Double max_price) {
        this.max_price = max_price;
    }

    public String getSpu_introduction() {
        return spu_introduction;
    }

    public void setSpu_introduction(String spu_introduction) {
        this.spu_introduction = spu_introduction;
    }

    public Byte getSpu_status() {
        return spu_status;
    }

    public void setSpu_status(Byte spu_status) {
        this.spu_status = spu_status;
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
