package com.zfh.shop.product.bean.po;

import java.sql.Date;

/**
 * SpuBanner 商品相册
 * */
public class SpuBanner {

    private Integer id;     // 相册编号
    private String spu_banner_name;     // 相册名称
    private String spu_banner_urls;     // 相册图片路径
    private Date createtime;        // 创建时间
    private Date updatetime;        // 更新时间
    private Integer spu_banner_spu_id;  // 所属商品编号

    // getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpu_banner_name() {
        return spu_banner_name;
    }

    public void setSpu_banner_name(String spu_banner_name) {
        this.spu_banner_name = spu_banner_name;
    }

    public String getSpu_banner_urls() {
        return spu_banner_urls;
    }

    public void setSpu_banner_urls(String spu_banner_urls) {
        this.spu_banner_urls = spu_banner_urls;
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

    public Integer getSpu_banner_spu_id() {
        return spu_banner_spu_id;
    }

    public void setSpu_banner_spu_id(Integer spu_banner_spu_id) {
        this.spu_banner_spu_id = spu_banner_spu_id;
    }
}
