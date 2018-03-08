package com.dongnengyu.mybatis_test2.entity;

/**
 * xiaomu (dongnengyu@gmail.com)
 * 2018/3/8
 */
public class UserTable {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String account;
    private String password;
}
