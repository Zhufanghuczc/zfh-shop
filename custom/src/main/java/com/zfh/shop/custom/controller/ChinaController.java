package com.zfh.shop.custom.controller;

import com.zfh.shop.custom.service.ChinaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 中国地区资源 controller
 * */
@RestController
public class ChinaController {

    // 依赖业务逻辑层
    @Resource
    private ChinaService chinaService;

    @RequestMapping(value = "/china",method = RequestMethod.GET)
    public Object getChinaList(Integer pid){

        return chinaService.getChinaListByPid(pid);
    }

}
