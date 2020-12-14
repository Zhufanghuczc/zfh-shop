package com.zfh.shop.custom.service.impl;

import com.zfh.shop.custom.bean.po.UserAddress;
import com.zfh.shop.custom.mapper.UserAddressMapper;
import com.zfh.shop.custom.service.IUserAddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户订单信息 资源业务逻辑层实现类
 * */
@Service
public class UserAddressService implements IUserAddressService {

    // 依赖的数据访问层接口
    @Resource
    private UserAddressMapper userAddressMapper;

    @Override
    public boolean addUserAddress(UserAddress userAddress) {
        return userAddressMapper.addUserAddress(userAddress) > 0;
    }

    @Override
    public boolean updateUserAddress(UserAddress userAddress) {
        return userAddressMapper.updateUserAddress(userAddress) > 0;
    }

    @Override
    public boolean deleteUserAddressById(Integer id) {
        return userAddressMapper.deleteUserAddressById(id) > 0;
    }

    @Override
    public List<UserAddress> getUserAddressByUserId(Integer user_id) {
        return userAddressMapper.getUserAddressByUserId(user_id);
    }
}
