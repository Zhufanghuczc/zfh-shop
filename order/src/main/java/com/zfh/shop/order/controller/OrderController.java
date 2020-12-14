package com.zfh.shop.order.controller;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.zfh.shop.order.bean.bo.AddOrderBo;
import com.zfh.shop.order.bean.po.OrderDetails;
import com.zfh.shop.order.service.IOrderService;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 订单资源 Controller
 * */
@RestController
public class OrderController {

    // 依赖的业务逻辑层 接口
    @Resource
    private IOrderService orderService;

    @RequestMapping(value = "/order",method = RequestMethod.POST)
    public Object addOrder(AddOrderBo bo, @RequestHeader String token){

        // 获取并设置用户 id
        DecodedJWT jwt = JWT.decode(token);
        int user_id = Integer.parseInt(jwt.getAudience().get(0));
        bo.getOrder().setOrder_user_id(user_id);
        // 生成订单编号
        bo.getOrder().setOrder_no(
                new Date(System.currentTimeMillis()).toString() +
                        "u" + bo.getOrder().getOrder_user_id() +
                        "r" + Math.random()*10000 );
        // 设置订单创建时间
        bo.getOrder().setCreatetime(new java.sql.Date(System.currentTimeMillis()));

        // 订单详情列表
        for (OrderDetails orderDetails : bo.getOrderDetailsList()) {
            orderDetails.setOdtails_scorestatus(0);
            orderDetails.setCreatetime(new java.sql.Date(System.currentTimeMillis() ));
        }

        boolean result = orderService.addOrder(bo);
        Map<String, Object> map = new HashMap<>();
        map.put("result",result);
        map.put("order",bo.getOrder());
        map.put("orderDetailsList",bo.getOrderDetailsList());
        return map;
    }
}
