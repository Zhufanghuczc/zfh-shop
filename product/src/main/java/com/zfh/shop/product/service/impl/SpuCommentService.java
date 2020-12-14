package com.zfh.shop.product.service.impl;

import com.zfh.shop.product.bean.bo.SpuCommentSearchBo;
import com.zfh.shop.product.bean.po.SpuComment;
import com.zfh.shop.product.mapper.SpuCommentMapper;
import com.zfh.shop.product.service.ISpuCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * SpuComment 商品评论资源 业务逻辑层实现类
 * */
@Service
public class SpuCommentService implements ISpuCommentService {

    // 数据访问层接口
    @Resource
    private SpuCommentMapper spuCommentMapper;

    @Override
    public List<SpuComment> getSpuCommentListBySpuId(Integer spu_id, SpuCommentSearchBo bo) {
        return spuCommentMapper.getSpuCommentListBySpuId(spu_id , bo);
    }
}
