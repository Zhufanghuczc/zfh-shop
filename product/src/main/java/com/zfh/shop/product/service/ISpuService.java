package com.zfh.shop.product.service;

import com.zfh.shop.product.bean.bo.SpuSearchBo;
import com.zfh.shop.product.bean.vo.SpuVo;

import java.util.List;

/**
 * Spu 商品资源 业务逻辑层接口
 * */
public interface ISpuService {

    /**
     * 根据商品搜索 对象获取 满足条件的商品列表
     * @param spuSearchBo 搜索业务模型
     * @return 满足条件的 商品实体模型对象列表
     * */
    List<SpuVo> getSpuVoList(SpuSearchBo spuSearchBo);

    /**
     * 根据商品编号 查询一个商品模型对象
     * @param spu_id 商品编号
     * @return 商品模型对象
     * */
    SpuVo getSpuVoById( Integer spu_id );

    /**
     * 修改商品的库存
     * @param id 商品 id
     * @param count 订购数量
     * @return 修改是否成功
     * */
    boolean updateSpuStock(Integer id,Integer count);

}
