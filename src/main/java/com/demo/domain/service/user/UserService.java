package com.demo.domain.service.user;

import com.demo.domain.model.mybatis.gen.TUser;

import java.util.List;

/**
 * Created by zs on 16/10/25.
 */
public interface UserService {
    List<TUser> findAll();
}
