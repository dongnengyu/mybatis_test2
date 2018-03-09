package com.dongnengyu.mybatis_test2.service;

import com.dongnengyu.mybatis_test2.dao.UserDao;
import com.dongnengyu.mybatis_test2.dao.UserTableDao;
import com.dongnengyu.mybatis_test2.entity.User;
import com.dongnengyu.mybatis_test2.entity.UserTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;


import java.awt.*;
import java.util.List;

/**
 * xiaomu (dongnengyu@gmail.com)
 * 2018/3/9
 */
@Configuration
@Service
public class RegisterService {

    @Autowired
    private UserTableDao userTableDao;
    @Autowired
    private UserDao userDao;

    public boolean register(UserTable userTable) {

        String account = userTable.getAccount();

        if (userTableDao.getUserTableByAccount(account) == null) {

            User user = new User();  //实例化一个User对象
            user.setAccount(account);//向User对象中插入账号

            userDao.insertUserOnlyAccount(account); //向user表中插入只包含account属性的user对象

            userTableDao.insertUserTable(userTable);//向user_table 表中插入账号和密码的user_table对象

            System.out.println("账号：" + account + " 不存在,注册成功");
            return true;
        } else {
            System.out.println("账号：" + account + " 已存在注册失败");
            return false;
        }
    }
}
