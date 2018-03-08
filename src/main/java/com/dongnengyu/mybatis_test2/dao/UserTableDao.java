package com.dongnengyu.mybatis_test2.dao;

import com.dongnengyu.mybatis_test2.entity.User;
import com.dongnengyu.mybatis_test2.entity.UserTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * xiaomu (dongnengyu@gmail.com)
 * 2018/3/8
 */
@Mapper
public interface UserTableDao {

    List<UserTableDao> queryUserTable();

    UserTable getUserTableById(@Param("id") int id);

    UserTable getUserTableByAccount(@Param("account") String account);

    int updateUserTable(@Param("userTableDao") UserTableDao userTableDao);

    int insertUserTable(@Param("user") UserTableDao userTableDao);

    int deleteUserTableById(@Param("id") int id);
}
