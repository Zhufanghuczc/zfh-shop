package com.zfh.shop.order.controller;

import com.zfh.shop.order.bean.po.OrderAddress;
import com.zfh.shop.order.service.IOrderAddressService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * OrderAddress Controller
 * */
@RestController
public class OrderAddressController {

    // 依赖的业务逻辑层 接口
    @Resource
    private IOrderAddressService orderAddressService;

    // 添加订单收货信息
    @RequestMapping(value = "/orderAddress",method = RequestMethod.POST)
    public Object addOrderAddress(OrderAddress orderAddress){
        orderAddress.setUpdateTime(new Date(System.currentTimeMillis()));
        boolean result = orderAddressService.addOrderAddress(orderAddress);

        Map<String, Object> map = new HashMap<>();
        map.put("result",result);
        map.put("orderAddress", orderAddress);
        return map;
    }

    // 修改订单收货信息
    @RequestMapping(value = "/orderAddress",method = RequestMethod.PUT)
    public Object updateOrderAddress(OrderAddress orderAddress){
        orderAddress.setUpdateTime(new Date(System.currentTimeMillis()));
        boolean result = orderAddressService.updateOrderAddress(orderAddress);
        
        Map<String, Object> map = new HashMap<>();
        map.put("result",result);
        map.put("orderAddress", orderAddress);
        return map;
    }
}
