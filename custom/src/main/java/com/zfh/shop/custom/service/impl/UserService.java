package com.zfh.shop.custom.service.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.zfh.shop.custom.bean.po.User;
import com.zfh.shop.custom.mapper.UserMapper;
import com.zfh.shop.custom.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.util.Date;

/**
 * User 用户资源 业务逻辑层 实现类
 * */
@Service
public class UserService implements IUserService {

    // 依赖的数据访问层 接口
    @Resource
    private UserMapper userMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public User login(String username, String password) {

        User user = userMapper.getUserByUsername(username);
        if (user != null){
            password = DigestUtils.md5DigestAsHex(password.getBytes());
            password = DigestUtils.md5DigestAsHex((password+user.getUser_salt()).getBytes());
            if ( user.getUser_password().equals(password) ){
                String token = JWT.create()
                        .withAudience( user.getId().toString() )
                        .withIssuedAt( new Date(System.currentTimeMillis()))        // 令牌签发时间
                        .withExpiresAt( new Date(System.currentTimeMillis()+1000*60*60) )   // 令牌结束时间
                        .sign(Algorithm.HMAC256(user.getUser_password()));
                user.setUser_token(token);
                user.setUser_expiretime(new Date(System.currentTimeMillis()+1000*60*60));
                user.setUser_loggedtime(new Date(System.currentTimeMillis()));
                userMapper.updateUser(user);
            }else{
                user = null;
            }
        }
        return user;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean regist(User user) {

        if ( userMapper.getUserByUsername(user.getUser_email()) != null ||
                userMapper.getUserByUsername(user.getUser_name()) != null ){
            return false;
        }else {
            // 密码 MD5
            String pwd = DigestUtils.md5DigestAsHex( user.getUser_password().getBytes() );
            // 加盐 手机号 MD5
            String salt = DigestUtils.md5DigestAsHex( user.getUser_phone().getBytes() );
            user.setUser_salt(salt);
            // 加密用户密码
            user.setUser_password( DigestUtils.md5DigestAsHex( (pwd+salt).getBytes() ) );
            // 用户默认安全等级
            user.setUser_securitylevel(2);
            // 用户默认性别
            user.setUser_gender(1);
            user.setUser_status((byte)0);
            user.setUser_createfrom(0);
            user.setCreatetime(new Date(System.currentTimeMillis()));

            int a = userMapper.addUser(user);
            return a>0;
        }
    }
}
