package com.zfh.shop.order.mapper;

import com.zfh.shop.order.bean.po.OrderAddress;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 订单收货信息 数据访问层接口
 * */
@Repository
public interface OrderAddressMapper {

    /**
     * 添加订单收货信息
     * @param orderAddress 实体对象
     * @return 数据库受影响行数
     * */
    int addOrderAddress(@Param("orderAddress") OrderAddress orderAddress);

    /**
     * 修改订单收货信息
     * @param orderAddress 实体对象
     * @return 数据库受影响行数
     * */
    int updateOrderAddress(@Param("orderAddress") OrderAddress orderAddress);

    /**
     * 根据 id 删除订单收货信息
     * @param orderNo 订单 id
     * @return 数据库受影响行数
     * */
    int deleteOrderAddress(@Param("orderNo") Integer orderNo);

    /**
     * 根据订单编号获取 收货信息
     * @param orderNo 订单编号
     * @return 满足条件的收货信息对象
     * */
    OrderAddress getOrderAddressByOrderNo(@Param("orderNo") String orderNo);

}
