package com.dongnengyu.mybatis_test2.controller;


import com.dongnengyu.mybatis_test2.entity.UserTable;
import com.dongnengyu.mybatis_test2.dao.UserTableDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * xiaomu (dongnengyu@gmail.com)
 * 2018/3/8
 */
@RestController
public class UserTableController {
    @Autowired
    private UserTableDao userTableDao;

    @RequestMapping(value = "/getUserByAccount")//通过account查询账号
    public UserTable getUserByAccount(@RequestParam("account") String account){
        UserTable userTable = userTableDao.getUserTableByAccount(account);
        System.out.println(userTable);
        return userTable;
    }

    @RequestMapping(value = "/selectAllUserTable" ,method = RequestMethod.GET)//查询所有账号
    public List queryUserTable(){
        return userTableDao.queryUserTable();
    }


    @RequestMapping(value = "/insertUserTable" , method = RequestMethod.POST)//插入账号
    public  String insert(@RequestBody UserTable userTable){
        userTableDao.insertUserTable(userTable);
        return "插入成功";
    }



}
