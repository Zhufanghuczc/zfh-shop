package com.zfh.shop.order.mapper;

import com.zfh.shop.order.bean.po.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 订单资源 数据访问层 接口
 * */
@Repository
public interface OrderMapper {

    /**
     * 添加订单信息
     * @param order 订单资源 实体模型
     * @return 数据库受影响行数
     * */
    int addOrder(@Param("order") Order order);

    /**
     * 修改订单信息
     * @param order 订单资源 实体模型
     * @return 数据库受影响行数
     * */
    int updateOrder(@Param("order") Order order);

    /**
     * 删除订单信息
     * @param id 订单资源 实体模型
     * @return 数据库受影响行数
     * */
    int deleteOrder(@Param("id") Integer id);

    /**
     * 根据 订单编号 获取订单
     * @param id 订单编号
     * @return 当前订单对象
     * */
    Order getOrderById(@Param("id") Integer id);

    /**
     * 根据订单号 获取订单
     * @param orderNo 订单号
     * @return 当前订单对象
     * */
    Order getOrderByOrderNo(@Param("orderNo") String orderNo);

    /**
     *获取该用户的 订单 列表
     * @param order_user_id 用户编号
     * @return 该用户的 订单列表
     * */
    List<Order> getOrderList(@Param("order_user_id") Integer order_user_id);
}
