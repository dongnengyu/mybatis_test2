package com.dongnengyu.mybatis_test2;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.ILoggerFactory;
import org.slf4j.LoggerFactory;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



/**
 * xiaomu (dongnengyu@gmail.com)
 * 2018/3/7
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j

public class LoggerTest {


   @Test
    public void test1(){
        String name="imooc";
        String password="123456";
        log.info("name:{}, password:{}",name,password);
        log.error("info......");

    }



}
