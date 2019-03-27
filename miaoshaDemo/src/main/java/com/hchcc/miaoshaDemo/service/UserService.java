package com.hchcc.miaoshaDemo.service;

import com.hchcc.miaoshaDemo.dao.UserDao;
import com.hchcc.miaoshaDemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User getById(int id){
        return userDao.getById(id);
    }
}
