package com.zfh.shop.order.service.impl;

import com.zfh.shop.order.bean.bo.CartSearchBo;
import com.zfh.shop.order.bean.po.Cart;
import com.zfh.shop.order.mapper.CartMapper;
import com.zfh.shop.order.service.ICartService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 购物车资源 业务逻辑层实现类
 * */
@Service
public class CartService implements ICartService {

    // 依赖的数据访问层接口
    @Resource
    private CartMapper cartMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean addCart(Cart cart) {

        CartSearchBo bo = new CartSearchBo();
        bo.setCart_userid(cart.getCart_userid());
        bo.setCart_name(cart.getCart_name());
        bo.setCart_spuid(cart.getCart_spuid());
        bo.setCart_sku(cart.getCart_sku());

        List<Cart> history = cartMapper.getCartList(bo);
        int a = 0;
        // 判断购物车是否已经存在 该购物车信息
        if (history.size() > 0){
            cart.setCart_count(cart.getCart_count()+history.get(0).getCart_count());
            a = cartMapper.updateCart(cart);
        } else {
            a = cartMapper.addCart(cart);
        }

        return a > 0;
    }

    @Override
    public boolean updateCart(Cart cart) {
        return cartMapper.updateCart(cart) > 0;
    }

    @Override
    public boolean deleteCart(Integer id) {
        return cartMapper.deleteCart(id) > 0;
    }

    @Override
    public List<Cart> getCartList(CartSearchBo bo) {
        return cartMapper.getCartList(bo);
    }
}
