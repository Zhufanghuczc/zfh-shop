package com.zfh.shop.product.mapper;

import com.zfh.shop.product.bean.po.Brand;
import org.apache.ibatis.annotations.Param;

/**
 * Brand 品牌 业务数据访问层接口
 * */
public interface BrandMapper {

    /**
     * 根据 品牌id 获取品牌对象
     * @param spu_brand_id 品牌id
     * @return 商品品牌对象
     * */
    Brand getBrandById(@Param("spu_brand_id") Integer spu_brand_id);

}
