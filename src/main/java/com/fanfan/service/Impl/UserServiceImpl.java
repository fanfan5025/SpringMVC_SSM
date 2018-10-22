package com.fanfan.service.Impl;

import com.fanfan.dao.UserDao;
import com.fanfan.entity.User;
import com.fanfan.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> list() {
        return userDao.list();
    }
}
