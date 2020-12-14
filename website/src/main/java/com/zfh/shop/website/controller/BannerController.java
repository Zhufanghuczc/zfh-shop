package com.zfh.shop.website.controller;

import com.zfh.shop.website.service.IBannerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BannerController {

    // 依赖的业务逻辑层接口
    @Resource
    private IBannerService bannerService;

    @RequestMapping( value = "/banner",method = RequestMethod.GET)
    public Object getBannerList( Byte status ){

        return bannerService.getBannerListByStatus(status);
    }

}
