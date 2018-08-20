package com.kevin.service.impl;

import com.kevin.dao.UserDao;
import com.kevin.entity.User;
import com.kevin.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by kinthon on 17-6-23.
 */
//注入服务
@Service("userService")
public class UserServiceImpl implements UserService{
    //自动注入userDao，也可以使用@Autowired
    @Resource(name="userDao")
    private UserDao userDao;

    @Override
    public boolean addUser(User user) {
        this.userDao.add(user);
        return true;
    }

    @Override
    public User login(User user) {
        User existUser = userDao.findByUsernameAndPassword(user);
        return existUser;
    }

    @Override
    public User getUserById(int id){
        User user = userDao.getUserById(id);
        return user;
    }

    @Override
    public List<User> getAll(){
        return  this.userDao.getAll();
    }

    @Override
    public void update(User user){
        userDao.update(user);
    }
}

