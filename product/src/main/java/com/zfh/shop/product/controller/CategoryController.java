package com.zfh.shop.product.controller;

import com.zfh.shop.product.service.ICategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Category 商品分类 资源 Controller
 * */
@RestController
public class CategoryController {

    // 业务逻辑层
    @Resource
    private ICategoryService categoryService;

    @RequestMapping( value = "/category" , method = RequestMethod.GET)
    public Object getCategoryList(Integer parent_id) {
        return categoryService.getCategoryListByParentId(parent_id);
    }

}
