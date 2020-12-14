package com.zfh.shop.product.controller;

import com.zfh.shop.product.bean.bo.SpuSearchBo;
import com.zfh.shop.product.service.ISpuService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
/**
 * Spu Controller
 * */
@RestController
public class SpuController {

    // 依赖 业务逻辑层接口
    @Resource
    private ISpuService spuService;

    @RequestMapping(value = "/spu" , method = RequestMethod.GET)
    public Object getSpuList(SpuSearchBo bo){

        return spuService.getSpuVoList(bo);
    }

    @RequestMapping(value = "/spu/{spu_id}",method = RequestMethod.GET)
    public Object getSpuById(Integer spu_id){

        return spuService.getSpuVoById(spu_id);
    }

    @RequestMapping(value = "/spu",method = RequestMethod.PATCH)
    public Object updateSpuStock(Integer id , Integer count){

        return spuService.updateSpuStock(id,count);
    }

}
