package com.zfh.shop.product.mapper;

import com.zfh.shop.product.bean.bo.SpuCommentSearchBo;
import com.zfh.shop.product.bean.po.SpuComment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 商品评论 资源 数据访问层接口
 * */
@Repository
public interface SpuCommentMapper {

    /**
     * 根据商品编号 获取商品评论列表
     * @param spu_id 商品编号
     * @param bo 商品评论业务模型对象
     * @return 商品评论列表
     * */
    List<SpuComment> getSpuCommentListBySpuId(@Param("spu_id") Integer spu_id,@Param("bo") SpuCommentSearchBo bo);

}
