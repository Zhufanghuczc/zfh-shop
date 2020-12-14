package com.zfh.shop.order.service;

import com.zfh.shop.order.bean.bo.CartSearchBo;
import com.zfh.shop.order.bean.po.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 购物车 资源业务逻辑层接口
 * */
public interface ICartService {

    /**
     * 添加一个购物车信息
     * @param cart 一条购物车信息
     * @return 操作是否成功
     * */
    boolean addCart(Cart cart);

    /**
     * 修改一个购物车
     * @param cart 要修改的购物车对象
     * @return 操作是否成功
     * */
    boolean updateCart(Cart cart);

    /**
     * 删除一个购物车
     * @param id 要修改的购物车对象
     * @return 操作是否成功
     * */
    boolean deleteCart(Integer id);

    /**
     * 根据购物车 搜索业务模型对象搜索购物车列表
     * @param bo 搜索业务模型对象
     * @return 满足条件的购物车列表信息
     * */
    List<Cart> getCartList(@Param("bo") CartSearchBo bo);

}
