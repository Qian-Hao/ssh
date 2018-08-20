package com.kevin.dao.impl;

import com.kevin.dao.UserDao;
import com.kevin.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kinthon on 17-6-23.
 */

@Transactional(rollbackFor = Exception.class)
//出现Exception异常回滚
@Repository("userDao") //进行注入
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    //注入sessionFactory
    @Resource
    public void setSessionFacotry(SessionFactory sessionFacotry) {
        super.setSessionFactory(sessionFacotry);
    }

    @Override
    public void add(User user) {
        this.getHibernateTemplate().save(user);
    }

    @Override
    public User findByUsernameAndPassword(User user) {
        String hql = "FROM User WHERE username = ? AND password = ?";
        List<User> list = this.getHibernateTemplate().find(hql, user.getUsername(), user.getPassword());
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public User getUserById(int id){
        return this.getHibernateTemplate().get(User.class,id);
    }

    @Override
    public List<User> getAll(){
        List<User> list = (List<User>) this.getHibernateTemplate().find("FROM User");
        return list;
    }

    @Override
    public void update(User user){
        this.getHibernateTemplate().update(user);
    }
}

