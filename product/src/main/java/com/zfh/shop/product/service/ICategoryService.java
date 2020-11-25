package com.zfh.shop.product.service;

import com.zfh.shop.product.bean.po.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Category 业务逻辑层接口
 * */
public interface ICategoryService {

    /**
     * 根据父级分类编号查询 次级分类对象
     * @param parent_id 父级分类编号
     * @return 次级分类列表
     * */
    List<Category> getCategoryListByParentId(Integer parent_id );

}
