package com.zfh.shop.custom.mapper;

import com.zfh.shop.custom.bean.po.UserAddress;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户收获信息资源 数据访问层接口
 * */
@Repository
public interface UserAddressMapper {

    /**
     * 添加收获信息
     * @param userAddress 收货信息资源 模型
     * @return 数据库受影响行数
     * */
    int addUserAddress(@Param("userAddress") UserAddress userAddress);

    /**
     * 修改收货信息
     * @param userAddress 收货信息资源 模型
     * @return 数据库受影响行数
     * */
    int updateUserAddress(@Param("userAddress") UserAddress userAddress);

    /**
     * 删除收货信息
     * @param id
     * @return 数据库受影响行数
     * */
    int deleteUserAddressById(@Param("id") Integer id);

    /**
     * 获取当前用户的订单列表
     * @param user_id 用户 id
     * @return 当前角色订单列表
     * */
    List<UserAddress> getUserAddressByUserId(@Param("user_id") Integer user_id);
}
