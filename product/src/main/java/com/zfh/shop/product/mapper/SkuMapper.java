package com.zfh.shop.product.mapper;

import com.zfh.shop.product.bean.po.Sku;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Sku 商品规格资源 数据访问层 接口
 * */
public interface SkuMapper {

    /**
     * 根据商品 编号获取商品 规格列表
     * @param spu_id 商品 编号
     * @return 当前商品的 规格列表
     * */
    List<Sku> getSkuListBySpuId( @Param("spu_id") Integer spu_id );

}
