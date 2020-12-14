package com.zfh.shop.custom.service.impl;

import com.zfh.shop.custom.bean.po.China;
import com.zfh.shop.custom.mapper.ChinaMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 获取中国地区 业务逻辑层实现类
 * */
@Service
public class ChinaService implements com.zfh.shop.custom.service.ChinaService {

    // 数据访问层接口
    @Resource
    private ChinaMapper chinaMapper;

    @Override
    public List<China> getChinaListByPid(Integer pid) {
        return chinaMapper.getChinaListByPid(pid);
    }



}
