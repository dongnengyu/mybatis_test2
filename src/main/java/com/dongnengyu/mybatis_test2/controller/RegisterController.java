package com.dongnengyu.mybatis_test2.controller;

import com.dongnengyu.mybatis_test2.entity.UserTable;
import com.dongnengyu.mybatis_test2.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * xiaomu (dongnengyu@gmail.com)
 * 2018/3/9
 */
@RestController
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @RequestMapping(value = "/register" , method = RequestMethod.POST)
    public Map<String,Object> register(@RequestBody UserTable userTable){
        Map<String,Object> response= new HashMap<String, Object>();
        response.put("register",registerService.register(userTable));
        System.out.println(response.get("register"));
         return response;
    }
}
