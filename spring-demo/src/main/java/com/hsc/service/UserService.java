package com.hsc.service;

import com.hsc.dao.entry.User;

import java.util.List;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: UserService
 * @Author: heshanchi
 * @CreateDate: 2021/7/1
 * @Description:
 */
public interface UserService {

    String getName();

    String getNameById(Integer id);

    List<User> getAllUser();

    int inserUser(User user);

    int updatetUser(User user);

    int deleteUser(Integer id);
}
