package com.zfh.shop.custom.mapper;

import com.zfh.shop.custom.bean.po.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 用户资源的 数据访问层接口
 * */
@Repository
public interface UserMapper {

    /**
     * 根据用户名称获取用户对象
     * @param username 用户名称
     * @return 当前名称 的用户对象
     * */
    User getUserByUsername( @Param("username") String username );

    /**
     * 根据用户信息 添加用户
     * @param user 用户模型对象
     * @return 数据库受影响行数
     * */
    int addUser(@Param("user") User user );

    /**
     * 修改用户对象
     * @param user 用户资源模型
     * @return 数据库受影响行数
     * */
    int updateUser(@Param("user") User user);

}
