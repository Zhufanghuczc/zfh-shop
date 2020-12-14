package com.zfh.shop.order.service.impl;

import com.zfh.shop.order.bean.bo.AddOrderBo;
import com.zfh.shop.order.bean.bo.CartSearchBo;
import com.zfh.shop.order.bean.po.Cart;
import com.zfh.shop.order.mapper.CartMapper;
import com.zfh.shop.order.mapper.OrderDetailsMapper;
import com.zfh.shop.order.mapper.OrderMapper;
import com.zfh.shop.order.service.IOrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单资源 业务逻辑层 实现类
 * */
@Service
public class OrderService implements IOrderService {

    // 依赖的 数据访问层接口
    @Resource
    private OrderMapper orderMapper;
    @Resource
    private OrderDetailsMapper orderDetailsMapper;
    @Resource
    private CartMapper cartMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean addOrder(AddOrderBo addOrderBo) {
        // 添加订单表
        int a = orderMapper.addOrder(addOrderBo.getOrder());
        // 添加订单详情列表
        int b = orderDetailsMapper.addOrderDetailsList(addOrderBo.getOrderDetailsList());
        // 清空当前用户已购买商品 购物车列表
        int user_id = addOrderBo.getOrder().getOrder_user_id();
        CartSearchBo bo = new CartSearchBo();
        bo.setCart_userid(user_id);
        List<Cart> cartList = cartMapper.getCartList(bo);
        int c = 0;
        for (Cart cart : cartList) {
            if(cart.getCart_checked() == 0) {
                 c = cartMapper.deleteCart(cart.getId());
            }

        }
        return a > 0 && b > 0 && c > 0;
    }
}
