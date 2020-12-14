package com.zfh.shop.order.bean.bo;

import com.zfh.shop.order.bean.po.Order;
import com.zfh.shop.order.bean.po.OrderDetails;

import java.util.ArrayList;
import java.util.List;

/**
 * 添加订单业务模型对象
 *
 * */
public class AddOrderBo {

    private Order order;
    private List<OrderDetails> orderDetailsList = new ArrayList<>();

    // getters and setters
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<OrderDetails> getOrderDetailsList() {
        return orderDetailsList;
    }

    public void setOrderDetailsList(List<OrderDetails> orderDetailsList) {
        this.orderDetailsList = orderDetailsList;
    }
}
