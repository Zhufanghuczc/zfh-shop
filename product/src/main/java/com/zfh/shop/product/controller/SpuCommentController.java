package com.zfh.shop.product.controller;

import com.zfh.shop.product.bean.bo.SpuCommentSearchBo;
import com.zfh.shop.product.service.ISpuCommentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * SpuComment 商品评论资源 Restfull 接口
 * */
@RestController
public class SpuCommentController {

    // 依赖的业务逻辑层接口
    @Resource
    private ISpuCommentService spuCommentService;

    @RequestMapping(value = "/spuComment", method = RequestMethod.GET)
    public Object getSpuCommentList(Integer spu_id , SpuCommentSearchBo bo){

        return spuCommentService.getSpuCommentListBySpuId(spu_id,bo);
    }

}
