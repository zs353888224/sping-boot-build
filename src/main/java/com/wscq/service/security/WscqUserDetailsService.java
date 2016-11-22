package com.wscq.service.security;


import com.wscq.domain.model.Account;
import com.wscq.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zs on 16/10/28.
 */
@Service
public class WscqUserDetailsService implements UserDetailsService {

    @Autowired
    UserService userService;

    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = userService.getByName(username);
        return new WscqUserDetails(account);
    }
}
