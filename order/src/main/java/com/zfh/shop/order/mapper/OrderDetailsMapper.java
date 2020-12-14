package com.zfh.shop.order.mapper;

import com.zfh.shop.order.bean.po.OrderDetails;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 订单详情资源 数据访问层接口
 * */
@Repository
public interface OrderDetailsMapper {

    /**
     * 添加订单详情列表
     * @param orderDetailsList 订单详情 资源实体模型
     * @return 数据库受影响行数
     * */
    int addOrderDetailsList(@Param("orderDetailsList") List<OrderDetails> orderDetailsList);

    /**
     * 修改订单详情
     * @param orderDetails 订单详情 资源实体模型
     * @return 数据库受影响行数
     * */
    int updateOrderDetails(@Param("orderDetails") OrderDetails orderDetails);

    /**
     * 删除订单详情
     * @param order_id 订单编号
     * @return 数据库受影响行数
     * */
    int deleteOrderDetails(@Param("order_id") Integer order_id);

    /**
     * 查询订单详情列表
     * @param order_id 订单编号
     * @return 该订单的订单详情列表
     * */
    List<OrderDetails> getOrderDetailsByOrderId(@Param("order_id") Integer order_id);

}
