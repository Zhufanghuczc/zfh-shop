package com.zfh.shop.order.service.impl;

import com.zfh.shop.order.bean.po.Order;
import com.zfh.shop.order.bean.po.OrderAddress;
import com.zfh.shop.order.mapper.OrderAddressMapper;
import com.zfh.shop.order.mapper.OrderMapper;
import com.zfh.shop.order.service.IOrderAddressService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Date;

/**
 * 订单收货信息资源 业务逻辑层 实现类
 * */
@Service
public class OrderAddressService implements IOrderAddressService {

    // 依赖的数据访问层 接口
    @Resource
    private OrderAddressMapper orderAddressMapper;
    @Resource
    private OrderMapper orderMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean addOrderAddress(OrderAddress orderAddress) {
        int a = orderAddressMapper.addOrderAddress(orderAddress);
        // 获取订单对象 修改快递费和总计金额
        Order order = orderMapper.getOrderByOrderNo(orderAddress.getOrderNo());
        order.setOrder_expressfee(6.0);
        order.setOrder_totalamount(order.getOrder_spuamount()+order.getOrder_expressfee()-order.getOrder_discountamount());
        int b = orderMapper.addOrder(order);

        return a > 0 && b > 0;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean updateOrderAddress(OrderAddress orderAddress) {
        int a = orderAddressMapper.updateOrderAddress(orderAddress);
        // 获取订单对象 修改快递费和总计金额
        Order order = orderMapper.getOrderByOrderNo(orderAddress.getOrderNo());
        order.setOrder_expressfee(6.0);
        order.setOrder_totalamount(order.getOrder_spuamount()+order.getOrder_expressfee()-order.getOrder_discountamount());
        int b = orderMapper.updateOrder(order);

        return a > 0;
    }
}
