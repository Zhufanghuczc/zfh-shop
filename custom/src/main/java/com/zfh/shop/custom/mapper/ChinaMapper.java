package com.zfh.shop.custom.mapper;

import com.zfh.shop.custom.bean.po.China;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 中国地区数据访问层 接口
 * */
@Repository
public interface ChinaMapper {

    /**
     * 根据父级分类编号查询 地区列表
     * @param pid
     * @return 地区列表
     * */
    List<China> getChinaListByPid(@Param("pid") Integer pid);

}
