package com.topwisesz.topwiseos.webservice.action;

import com.topwisesz.topwiseos.webservice.bean.User;
import com.topwisesz.topwiseos.webservice.service.impl.UserService;

public class UserAction extends BaseAction {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String login() throws Exception {
        User user = userService.selectAll().get(0);
        if (user!= null) {
            getWriter().write(user.toString());
        } else {
            getWriter().write("user.toString()");
        }
        return null;
    }
}
