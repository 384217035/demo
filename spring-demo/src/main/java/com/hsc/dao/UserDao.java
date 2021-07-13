package com.hsc.dao;

import com.hsc.dao.entry.User;

import java.util.List;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: UserDao
 * @Author: heshanchi
 * @CreateDate: 2021/7/1
 * @Description:
 */
public interface UserDao {

    String getName();

    String getNameById(Integer id);

    List<User> fingAllUser();

    int inser(User user);

    int updateUser(User user);

    int deleteUser(Integer id);

}
