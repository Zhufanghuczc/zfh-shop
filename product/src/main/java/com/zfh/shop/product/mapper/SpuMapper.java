package com.zfh.shop.product.mapper;


import com.zfh.shop.product.bean.bo.SpuSearchBo;
import com.zfh.shop.product.bean.vo.SpuVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spu 商品资源的 数据访问层接口
 * */
@Repository
public interface SpuMapper {

    /**
     * 根据商品搜索 对象获取 满足条件的商品列表
     * @param spuSearchBo 搜索业务模型
     * @return 满足条件的 商品实体模型对象列表
     * */
    List<SpuVo> getSpuVoList(@Param("bo") SpuSearchBo spuSearchBo);

    /**
     * 根据商品编号 查询一个商品模型对象
     * @param spu_id 商品编号
     * @return 商品模型对象
     * */
    SpuVo getSpuVoById(@Param("spu_id") Integer spu_id );

    /**
     * 修改商品的库存
     * @param id 商品 id
     * @param count 订购数量
     * @return 数据库受影响行数
     * */
    int updateSpuStock(@Param("id") Integer id,@Param("count") Integer count);

}
