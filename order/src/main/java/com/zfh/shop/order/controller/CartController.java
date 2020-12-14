package com.zfh.shop.order.controller;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.zfh.shop.order.bean.bo.CartSearchBo;
import com.zfh.shop.order.bean.po.Cart;
import com.zfh.shop.order.service.ICartService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CartController {

    // 依赖的业务逻辑层接口
    @Resource
    private ICartService cartService;

    // 添加
    @RequestMapping(value = "/cart",method = RequestMethod.POST)
    public Object addCart(@RequestHeader String token , Cart cart){
        DecodedJWT jwt = JWT.decode(token);
        cart.setCart_userid(Integer.parseInt(jwt.getAudience().get(0)));

        Map<String , Object> map = new HashMap<>();
        map.put("result",cartService.addCart(cart));

        return map;
    }

    // 修改
    @RequestMapping(value = "/cart",method = RequestMethod.PUT)
    public Object updateCart(Cart cart){
        cart.setUpdatetime(new Date(System.currentTimeMillis()));

        Map<String , Object> map = new HashMap<>();
        map.put("result",cartService.updateCart(cart));

        return map;
    }

    // 删除
    @RequestMapping(value = "/cart/{id}",method = RequestMethod.DELETE)
    public Object deleteCart(@PathVariable Integer id){
        Map<String , Object> map = new HashMap<>();
        map.put("result",cartService.deleteCart(id));

        return map;
    }

    // 查询
    @RequestMapping(value = "/cart",method = RequestMethod.GET)
    public Object getCartList(@RequestHeader String token , CartSearchBo bo){

        DecodedJWT jwt = JWT.decode(token);
        bo.setCart_userid(Integer.parseInt(jwt.getAudience().get(0)));

        Map<String, Object> map = new HashMap<>();
        List<Cart> result = cartService.getCartList(bo);
        map.put("result",result);

        return map;
    }
}
