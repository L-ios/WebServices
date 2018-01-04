package com.topwisesz.topwiseos.webservices.action;

import com.topwisesz.topwiseos.webservices.bean.User;
import com.topwisesz.topwiseos.webservices.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserAction extends BaseAction {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String login() throws Exception{
        User loginUser = userService.checkUser("100008441", null);
        if (loginUser != null) {
            getWriter().write(loginUser.toString());
            return null;
        } else {
            getWriter().write("帐号或密码不正确!");
            return null;
        }
    }
}
