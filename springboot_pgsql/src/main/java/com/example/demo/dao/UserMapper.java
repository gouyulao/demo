package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 查询所有数据
     */
    List<User> findAll();

    /**
     * 添加用户
     */
    int addUser(User user);

    /**
     * 删除用户
     */
    int delUser(int id);

    /**
     * 更新用户
     */
    int updUser(User user);
}
