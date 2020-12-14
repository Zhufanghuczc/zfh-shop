package com.zfh.shop.product.mapper;

import com.zfh.shop.product.ProductApplicationTest;
import org.junit.Test;

import javax.annotation.Resource;

public class ProductMapper extends ProductApplicationTest {

    @Resource
    private SpuMapper spuMapper;
    @Resource
    private BrandMapper brandMapper;

    @Resource
    private CategoryMapper categoryMapper;

    @Test
    public void getBrandById(){
        System.out.println("获取品牌对象："+categoryMapper.getCategoryById(1));
    }

}
