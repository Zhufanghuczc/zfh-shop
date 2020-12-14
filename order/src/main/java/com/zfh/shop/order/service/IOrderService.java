package com.zfh.shop.order.service;

import com.zfh.shop.order.bean.bo.AddOrderBo;

/**
 * Order 订单资源 业务逻辑层 接口
 * */
public interface IOrderService {

    /**
     * 添加订单
     * @param addOrderBo 订单添加 业务模型对象
     * @return 添加是否成功
     * */
    boolean addOrder(AddOrderBo addOrderBo);



}
