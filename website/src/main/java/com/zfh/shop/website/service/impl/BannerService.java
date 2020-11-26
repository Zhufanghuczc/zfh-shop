package com.zfh.shop.website.service.impl;

import com.zfh.shop.website.bean.po.Banner;
import com.zfh.shop.website.mapper.BannerMapper;
import com.zfh.shop.website.service.IBannerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Banner 业务逻辑层实现类
 * */
@Service
public class BannerService implements IBannerService {

    // 依赖数据访问层
    @Resource
    private BannerMapper bannerMapper;

    @Override
    public List<Banner> getBannerListByStatus(Byte status) {
        return bannerMapper.getBannerListByStatus(status);
    }
}
