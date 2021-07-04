package com.hsc.dao.impl;

import com.hsc.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: UserDao
 * @Author: heshanchi
 * @CreateDate: 2021/7/1
 * @Description:
 */
public class UserDaoImpl implements UserDao {

    @Override
    public String getName() {
        return "abc";
    }

}
