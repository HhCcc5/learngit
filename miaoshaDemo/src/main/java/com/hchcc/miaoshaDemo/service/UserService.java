package com.hchcc.miaoshaDemo.service;

import com.hchcc.miaoshaDemo.dao.UserDao;
import com.hchcc.miaoshaDemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User getById(int id){
        return userDao.getById(id);
    }

    @Transactional
    public Boolean tx() {
        User user1 = new User(1,"zhangfangmo");
        User user2 = new User(3,"aiye");

        userDao.insertUser(user2);
        userDao.insertUser(user1);
        return true;

    }
}
