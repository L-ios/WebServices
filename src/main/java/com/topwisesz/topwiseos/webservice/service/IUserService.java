package com.topwisesz.topwiseos.webservice.service;

import com.topwisesz.topwiseos.webservice.bean.User;

import java.util.List;

public interface IUserService {
    public List<User> selectAll();
}
