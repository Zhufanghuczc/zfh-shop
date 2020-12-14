package com.zfh.shop.product.service;

import com.zfh.shop.product.bean.bo.SpuCommentSearchBo;
import com.zfh.shop.product.bean.po.SpuComment;

import java.util.List;

/**
 * SpuComment 商品评论 资源业务逻辑层接口
 * */
public interface ISpuCommentService {

    /**
     * 根据商品编号 获取商品评论列表
     * @param spu_id 商品编号
     * @param bo 商品评论业务模型对象
     * @return 商品评论列表
     * */
    List<SpuComment> getSpuCommentListBySpuId(Integer spu_id, SpuCommentSearchBo bo);

}
