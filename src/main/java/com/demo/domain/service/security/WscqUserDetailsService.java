package com.demo.domain.service.security;


import com.demo.domain.model.Account;
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

    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = new Account();
        account.setUserId(1l);
        account.setAccountType("SUPPER");
//        account.setPassword("$2a$10$oa539vZ96KGTQwJAi18ZyOHAMcSY.H9de3PURWazfPdO0nR9vWj8.");
        // TODO 需要研究密码加密设置
        account.setPassword("123");
        account.setUserName("zs");
        return new WscqUserDetails(account);
    }
}
