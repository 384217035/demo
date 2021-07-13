package com.hsc.controller;

import com.hsc.dao.entry.User;
import com.hsc.service.UserService;

import java.util.List;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: UserController
 * @Author: heshanchi
 * @CreateDate: 2021/7/1
 * @Description:
 */
public class UserController {

    private UserService userService;

    public String getName() {
        return userService.getName();
    }

    public String getNameById(Integer id) {
        return userService.getNameById(id);
    }

    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    public int insertUser(User user) {
        return userService.inserUser(user);
    }

    public int updatetUser(User user) {
        return userService.updatetUser(user);
    }

    public int deleteUser(Integer id){
        return userService.deleteUser(id);
    }


    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
