package com.demo.domain.model;

import java.io.Serializable;

/**
 * Created by zs on 16/10/28.
 */
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;

    private String userName;

    private String password;

    private String accountType;

    private Long userId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
