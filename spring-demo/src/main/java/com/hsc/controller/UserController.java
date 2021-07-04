package com.hsc.controller;

import com.hsc.service.UserService;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: UserController
 * @Author: heshanchi
 * @CreateDate: 2021/7/1
 * @Description:
 */
public class UserController {

    private UserService userService;

    public String getName(){
        return userService.getName();
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
