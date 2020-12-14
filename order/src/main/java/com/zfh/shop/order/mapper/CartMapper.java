package com.zfh.shop.order.mapper;

import com.zfh.shop.order.bean.bo.CartSearchBo;
import com.zfh.shop.order.bean.po.Cart;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Cart 资源 数据访问层接口
 * */
@Repository
public interface CartMapper {

    /**
     * 添加一个购物车信息
     * @param cart 一条购物车信息
     * @return 数据库受影响行数
     * */
    int addCart(@Param("cart") Cart cart);

    /**
     * 修改一个购物车
     * @param cart 要修改的购物车对象
     * @return 数据库受影响行数
     * */
    int updateCart(@Param("cart") Cart cart);

    /**
     * 删除一个购物车
     * @param id 要修改的购物车对象
     * @return 数据库受影响行数
     * */
    int deleteCart(@Param("id") Integer id);

    /**
     * 根据购物车 搜索业务模型对象搜索购物车列表
     * @param bo 搜索业务模型对象
     * @return 满足条件的购物车列表信息
     * */
    List<Cart> getCartList(@Param("bo") CartSearchBo bo);
}
