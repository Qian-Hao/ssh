package com.kevin.service;

import com.kevin.entity.User;

import java.util.List;

/**
 * Created by kinthon on 17-6-23.
 */
public interface UserService {
    public boolean addUser(User user);

    public User login(User user);

    public User getUserById(int id);

    public List<User> getAll();

    public void update(User user);
}

