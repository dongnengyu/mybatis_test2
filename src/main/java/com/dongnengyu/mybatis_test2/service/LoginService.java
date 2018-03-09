package com.dongnengyu.mybatis_test2.service;

import com.dongnengyu.mybatis_test2.dao.UserTableDao;
import com.dongnengyu.mybatis_test2.entity.UserTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


import java.awt.*;
import java.util.List;

/**
 * xiaomu (dongnengyu@gmail.com)
 * 2018/3/9
 */
@Configuration
public class LoginService {

    @Autowired
    private UserTableDao userTableDao;

    public boolean login(UserTable userTable) {

        String account = userTable.getAccount();
        String password = userTable.getPassword();

        System.out.println(userTableDao.getUserTableByAccount(account));



            //首先判断账号是否存在于数据库，然后再判断密码
        if(userTableDao.getUserTableByAccount(account)==null){
            System.out.println("账号："+account+"不存在，登录失败");
            return false;
        }
        else {
            if (userTableDao.getUserTableByAccount(account).getAccount().equals(account) &&
                    userTableDao.getUserTableByAccount(account).getPassword().equals(password)){

                System.out.println("用户："+userTableDao.getUserTableByAccount(account).getAccount()+"登录成功");
                return true;

            }
            else
            {
                System.out.println("用户："+userTableDao.getUserTableByAccount(account).getAccount()+"尝试登录密码错误");
                return false;
            }
        }
    }
}
