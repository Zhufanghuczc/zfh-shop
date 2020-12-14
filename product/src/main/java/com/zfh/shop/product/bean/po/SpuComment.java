package com.zfh.shop.product.bean.po;

import java.sql.Date;

/**
 * 商品评论
 * */
public class SpuComment {

    private Integer id;
    private Double scomm_score;
    private String scomm_content;
    private String scomm_photourls;
    private Integer scomm_likes;
    private Byte scomm_status;
    private Date createtime;
    private Date updatetime;
    private Integer scomm_orderno_id;
    private Integer scomm_spu_id;
    private Integer scomm_user_id;
    private String scomm_spu_sku;
    private String scomm_user_name;
    private String scomm_user_avatarurl;

    // getters and setters

    public String getScomm_user_name() {
        return scomm_user_name;
    }

    public void setScomm_user_name(String scomm_user_name) {
        this.scomm_user_name = scomm_user_name;
    }

    public String getScomm_user_avatarurl() {
        return scomm_user_avatarurl;
    }

    public void setScomm_user_avatarurl(String scomm_user_avatarurl) {
        this.scomm_user_avatarurl = scomm_user_avatarurl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getScomm_score() {
        return scomm_score;
    }

    public void setScomm_score(Double scomm_score) {
        this.scomm_score = scomm_score;
    }

    public String getScomm_content() {
        return scomm_content;
    }

    public void setScomm_content(String scomm_content) {
        this.scomm_content = scomm_content;
    }

    public String getScomm_photourls() {
        return scomm_photourls;
    }

    public void setScomm_photourls(String scomm_photourls) {
        this.scomm_photourls = scomm_photourls;
    }

    public Integer getScomm_likes() {
        return scomm_likes;
    }

    public void setScomm_likes(Integer scomm_likes) {
        this.scomm_likes = scomm_likes;
    }

    public Byte getScomm_status() {
        return scomm_status;
    }

    public void setScomm_status(Byte scomm_status) {
        this.scomm_status = scomm_status;
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

    public Integer getScomm_orderno_id() {
        return scomm_orderno_id;
    }

    public void setScomm_orderno_id(Integer scomm_orderno_id) {
        this.scomm_orderno_id = scomm_orderno_id;
    }

    public Integer getScomm_spu_id() {
        return scomm_spu_id;
    }

    public void setScomm_spu_id(Integer scomm_spu_id) {
        this.scomm_spu_id = scomm_spu_id;
    }

    public Integer getScomm_user_id() {
        return scomm_user_id;
    }

    public void setScomm_user_id(Integer scomm_user_id) {
        this.scomm_user_id = scomm_user_id;
    }

    public String getScomm_spu_sku() {
        return scomm_spu_sku;
    }

    public void setScomm_spu_sku(String scomm_spu_sku) {
        this.scomm_spu_sku = scomm_spu_sku;
    }
}
