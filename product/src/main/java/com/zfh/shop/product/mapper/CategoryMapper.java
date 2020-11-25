package com.zfh.shop.product.mapper;

import com.zfh.shop.product.bean.po.Category;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Category 数据访问层接口
 * */
@Repository
public interface CategoryMapper {

  /**
   * 根据父级分类编号查询 次级分类对象
   * @param parent_id 父级分类编号
   * @return 次级分类列表
   * */
  List<Category> getCategoryListByParentId( @Param("parent_id") Integer parent_id );

}
