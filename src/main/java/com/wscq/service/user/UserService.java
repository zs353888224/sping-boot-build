package com.wscq.service.user;

import com.wscq.domain.model.Account;
import com.wscq.domain.model.mybatis.gen.TUser;

import java.util.List;

/**
 * Created by zs on 16/10/25.
 */
public interface UserService {
    List<TUser> findAll();
    Account getByName(String name);
}
