package com.hsc.service.impl;

import com.hsc.dao.UserDao;
import com.hsc.dao.entry.User;
import com.hsc.service.UserService;

import java.util.List;

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

    @Override
    public String getNameById(Integer id) {
        return userDao.getNameById(id);
    }

    @Override
    public List<User> getAllUser() {
        return userDao.fingAllUser();
    }

    @Override
    public int inserUser(User user) {
        return userDao.inser(user);
    }

    @Override
    public int updatetUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return userDao.deleteUser(id);
    }


    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
