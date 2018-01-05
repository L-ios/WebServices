package com.topwisesz.topwiseos.webservice.service.impl;

import com.topwisesz.topwiseos.webservice.bean.User;
import com.topwisesz.topwiseos.webservice.dao.UserMapper;
import com.topwisesz.topwiseos.webservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService implements IUserService {
    @Autowired
    private UserMapper userDao;

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }
}
