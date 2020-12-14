package com.zfh.shop.order.service;

import com.zfh.shop.order.bean.po.OrderAddress;

/**
 * 订单收货信息资源 业务逻辑层 接口
 * */
public interface IOrderAddressService {

    /**
     * 添加订单收货信息
     * @param orderAddress 实体对象
     * @return 数据库操作是否成功
     * */
    boolean addOrderAddress(OrderAddress orderAddress);

    /**
     * 修改订单收货信息
     * @param orderAddress 实体对象
     * @return 数据库操作是否成功
     * */
    boolean updateOrderAddress(OrderAddress orderAddress);

}
