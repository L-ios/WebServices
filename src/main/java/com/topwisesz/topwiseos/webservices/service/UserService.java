package com.topwisesz.topwiseos.webservices.service;

import com.topwisesz.topwiseos.webservices.bean.User;
import com.topwisesz.topwiseos.webservices.dao.UserDao;

import java.util.List;

public class UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User checkUser(String name, String password) {
        List<User> user = userDao.getUser(name, password);
        if (user != null && user.size() > 0) {
            return user.get(0);
        } else {
            return null;
        }
    }
}
