package com.zfh.shop.product.bean.po;

import java.sql.Date;

/**
 * Sku 商品规格
 * */
public class Sku {

    private Integer id;         // 规格编号
    private Integer sku_spu_id;     // 所属商品编号
    private String sku_name;    // 规格名称
    private String sku_spuattr; // 规格值
    private Integer sortno;     // 规格排序
    private Date createtime;    // 规格创建时间
    private Date updatetime;    // 规格更新时间

    // getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSku_spu_id() {
        return sku_spu_id;
    }

    public void setSku_spu_id(Integer sku_spu_id) {
        this.sku_spu_id = sku_spu_id;
    }

    public String getSku_name() {
        return sku_name;
    }

    public void setSku_name(String sku_name) {
        this.sku_name = sku_name;
    }

    public String getSku_spuattr() {
        return sku_spuattr;
    }

    public void setSku_spuattr(String sku_spuattr) {
        this.sku_spuattr = sku_spuattr;
    }

    public Integer getSortno() {
        return sortno;
    }

    public void setSortno(Integer sortno) {
        this.sortno = sortno;
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
}
