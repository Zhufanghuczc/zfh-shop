package com.zfh.shop.product.mapper;

import com.zfh.shop.product.bean.po.SpuBanner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * SpuBanner 商品相册资源 数据访问层 接口
 * */
public interface SpuBannerMapper {

    /**
     * 根据商品 编号查询 商品相册列表
     * @param spu_id 商品编号
     * @return 商品相册列表
     * */
    List<SpuBanner> getSpuBannerListBySpuId( @Param("spu_id") Integer spu_id );

}
