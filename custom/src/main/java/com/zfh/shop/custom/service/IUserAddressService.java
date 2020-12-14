package com.zfh.shop.custom.service;

import com.zfh.shop.custom.bean.po.UserAddress;

import java.util.List;

/**
 * 用户订单资源 业务逻辑层接口
 * */
public interface IUserAddressService {

    /**
     * 添加收获信息
     * @param userAddress 收货信息资源 模型
     * @return 添加订单是否成功
     * */
    boolean addUserAddress(UserAddress userAddress);

    /**
     * 修改收货信息
     * @param userAddress 收货信息资源 模型
     * @return 修改订单是否成功
     * */
    boolean updateUserAddress(UserAddress userAddress);

    /**
     * 删除收货信息
     * @param id 订单编号
     * @return 删除订单是否成功
     * */
    boolean deleteUserAddressById(Integer id);

    /**
     * 获取当前用户的订单列表
     * @param user_id 用户 id
     * @return 当前角色订单列表
     * */
    List<UserAddress> getUserAddressByUserId(Integer user_id);

}
