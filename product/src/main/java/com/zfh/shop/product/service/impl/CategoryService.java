package com.zfh.shop.product.service.impl;

import com.zfh.shop.product.bean.po.Category;
import com.zfh.shop.product.mapper.CategoryMapper;
import com.zfh.shop.product.service.ICategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Category 业务逻辑层 实现类
 * */
@Service
public class CategoryService implements ICategoryService {

    // 数据访问层接口
    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getCategoryListByParentId(Integer parent_id) {
        return categoryMapper.getCategoryListByParentId(parent_id);
    }
}
