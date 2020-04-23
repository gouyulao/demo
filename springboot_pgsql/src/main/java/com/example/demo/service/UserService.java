package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.List;

public interface UserService {
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
