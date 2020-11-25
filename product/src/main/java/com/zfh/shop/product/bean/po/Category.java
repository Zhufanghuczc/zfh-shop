package com.zfh.shop.product.bean.po;

import java.util.Date;

/**
 * Category 商品分类
 * */
public class Category {

    private Integer id;
    private String cate_name;
    private String cate_sort;
    private Date createtime;
    private Date updatetime;
    private Integer parent_id;


    // getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCate_name() {
        return cate_name;
    }

    public void setCate_name(String cate_name) {
        this.cate_name = cate_name;
    }

    public String getCate_sort() {
        return cate_sort;
    }

    public void setCate_sort(String cate_sort) {
        this.cate_sort = cate_sort;
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

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }
}
