package com.zfh.shop.cart.mapper;

import com.zfh.shop.cart.ApplicationTest;
import com.zfh.shop.order.bean.po.Cart;
import com.zfh.shop.order.mapper.CartMapper;
import org.junit.Test;
import org.springframework.boot.SpringBootConfiguration;

import javax.annotation.Resource;
@SpringBootConfiguration
public class CartRepositoryTest extends ApplicationTest {

    @Resource
    private CartMapper cartMapper;

    @Test
    public void addCart(){
        Cart cart = new Cart();
        cart.setCart_price(123.2);
        System.out.println(cartMapper.addCart(cart)>0);
    }
}
