package com.demo.domain.service.user;

import com.demo.domain.model.mybatis.gen.TUser;
import com.demo.domain.repository.mybatis.TUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zs on 16/10/25.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    TUserMapper userMapper;

    @Override
    public List<TUser> findAll() {
        return userMapper.selectAll();
    }
}
