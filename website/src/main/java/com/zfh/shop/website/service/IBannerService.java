package com.zfh.shop.website.service;

import com.zfh.shop.website.bean.po.Banner;

import java.util.List;

/**
 * Banner 模块 业务逻辑层接口
 * */
public interface IBannerService {

    /**
     * 根据轮播状态查询轮播列表
     * @param status 轮播状态
     * @return 当前状态的轮播列表
     * */
    List<Banner> getBannerListByStatus(Byte status);

}
