package com.dongnengyu.mybatis_test2.dao;

import com.dongnengyu.mybatis_test2.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * xiaomu (dongnengyu@gmail.com)
 * 2018/3/6
 */
@Mapper
public interface UserDao {
    List<User> queryUser();

    User getUserById(@Param("id") int id);

    User getUserByName(@Param("name") String name);

    int updateUser(@Param("user") User user);

    int insertUser(@Param("user") User user);

    int deleteUserById(@Param("id") int id);
}
