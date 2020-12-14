package com.zfh.shop.custom.service;

import com.zfh.shop.custom.bean.po.China;

import java.util.List;

/**
 * 获取中国地区业务逻辑层接口
 * */
public interface ChinaService {

    /**
     * 根据父级分类编号查询 地区列表
     * @param pid
     * @return 地区列表
     * */
    List<China> getChinaListByPid(Integer pid);

}
