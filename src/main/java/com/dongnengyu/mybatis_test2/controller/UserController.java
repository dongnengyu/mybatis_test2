package com.dongnengyu.mybatis_test2.controller;

import com.dongnengyu.mybatis_test2.dao.UserDao;
import com.dongnengyu.mybatis_test2.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.PanelUI;
import java.util.List;

/**
 * xiaomu (dongnengyu@gmail.com)
 * 2018/3/6
 */
@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/getUserByName")//通过id查询用户
    public User getUserByName(@RequestParam("name") String name){
        User user = userDao.getUserByName(name);
        System.out.println(user);
        return user;
    }

    @RequestMapping("/getUserById")//通过id查询用户
    public User hello(@RequestParam("id") Integer id){
        User user = userDao.getUserById(id);
        System.out.println(user);
        return user;
    }

    @RequestMapping(value = "/insertUser" , method = RequestMethod.POST)
    public  String insert(@RequestBody User user){
        userDao.insertUser(user);
        return "插入成功";
    }

    @RequestMapping(value = "/updateUser" ,method = RequestMethod.POST)
    public String updateUser(@RequestBody User user){
        userDao.updateUser(user);
        return "更改成功";
    }

    @RequestMapping(value = "/selectAllUser" ,method = RequestMethod.GET)
    public List queryUserr(){
        return userDao.queryUser();
    }











}
