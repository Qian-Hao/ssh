package com.kevin.dao;

import com.kevin.entity.User;

import java.util.List;

/**
 * Created by kinthon on 17-6-23.
 */
public interface UserDao {
    //添加并保存用户

    public void add(User user);

    //进行登录

    public User findByUsernameAndPassword(User user);

    //获取用户列表

    public List<User> getAll();

    //根据用户Id获取用户信息

    public User getUserById(int id);

    //更新用户信息

    public void update(User user);

    //根据用户id删除用户信息

}

