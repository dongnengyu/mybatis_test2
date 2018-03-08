package com.dongnengyu.mybatis_test2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.dongnengyu.mybatis_test2")
@MapperScan("com.dongnengyu.mybatis_test2")
public class MybatisTest2Application {

	public static void main(String[] args) {
		SpringApplication.run(MybatisTest2Application.class, args);
	}
}
