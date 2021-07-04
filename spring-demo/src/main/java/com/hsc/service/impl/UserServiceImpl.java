package com.hsc.service.impl;

import com.hsc.dao.UserDao;
import com.hsc.service.UserService;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: Impl
 * @Author: heshanchi
 * @CreateDate: 2021/7/1
 * @Description:
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public String getName() {
        return "1111aaaa";
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
