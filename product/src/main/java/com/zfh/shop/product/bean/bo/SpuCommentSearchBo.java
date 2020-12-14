package com.zfh.shop.product.bean.bo;

import java.sql.Date;
import java.util.List;

/**
 * 商品评论 分类查询 业务模型对象
 * */
public class SpuCommentSearchBo {

    private Double min_score;
    private Double max_score;
    private String scomm_upload_type;
    private Byte scomm_status;
    private Integer scomm_spu_id;
    private List<String> scomm_spu_sku;

    private String sort;
    private String order;

    private Integer start=0;
    private Integer length=10;

    // getters and setters
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

    public Double getMin_score() {
        return min_score;
    }

    public void setMin_score(Double min_score) {
        this.min_score = min_score;
    }

    public Double getMax_score() {
        return max_score;
    }

    public void setMax_score(Double max_score) {
        this.max_score = max_score;
    }

    public String getScomm_upload_type() {
        return scomm_upload_type;
    }

    public void setScomm_upload_type(String scomm_upload_type) {
        this.scomm_upload_type = scomm_upload_type;
    }

    public Byte getScomm_status() {
        return scomm_status;
    }

    public void setScomm_status(Byte scomm_status) {
        this.scomm_status = scomm_status;
    }

    public Integer getScomm_spu_id() {
        return scomm_spu_id;
    }

    public void setScomm_spu_id(Integer scomm_spu_id) {
        this.scomm_spu_id = scomm_spu_id;
    }

    public List<String> getScomm_spu_sku() {
        return scomm_spu_sku;
    }

    public void setScomm_spu_sku(List<String> scomm_spu_sku) {
        this.scomm_spu_sku = scomm_spu_sku;
    }
}
