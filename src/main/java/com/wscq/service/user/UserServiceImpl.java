package com.wscq.service.user;

import com.wscq.domain.model.Account;
import com.wscq.domain.model.mybatis.gen.TUser;
import com.wscq.domain.repository.mybatis.TUserMapper;
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

    @Override
    public Account getByName(String name) {
        TUser tUser = userMapper.getUserByName(name);
        if (tUser == null){
            return null;
        }
        Account account = new Account();
        account.setAccountType("HEHE");
        account.setPassword(tUser.getPassword());
        account.setUserId(tUser.getUserId());
        account.setUserName(name);
        return account;
    }
}