package com.hsc.dao.impl;

import com.hsc.dao.UserDao;
import com.hsc.dao.entry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SingleColumnRowMapper;

import java.util.List;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: UserDao
 * @Author: heshanchi
 * @CreateDate: 2021/7/1
 * @Description:
 */
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String getName() {
        return "abc";
    }

    @Override
    public String getNameById(Integer id) {
        String sql = "SELECT name FROM user WHERE id = ? LIMIT 0,1";

        List<String> query = jdbcTemplate.query(sql, new SingleColumnRowMapper<String>(String.class), id);
        return (query == null || query.isEmpty()) ? null : query.get(0);
    }

    @Override
    public List<User> fingAllUser() {
        String sql = "SELECT id, name, age FROM user";
        List<User> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return query;
    }

    @Override
    public int inser(User user) {
        String sql = "INSERT INTO user (name, age) VALUES (? ,?) ";
        int count = jdbcTemplate.update(sql, new Object[]{user.getName(), user.getAge()});
        return count;
    }

    @Override
    public int updateUser(User user) {
        String sql = "UPDATE user SET  name = ?, age = ? WHERE id = ? ";
        int count = jdbcTemplate.update(sql, new Object[]{user.getName(), user.getAge(), user.getId()});
        return count;
    }

    @Override
    public int deleteUser(Integer id) {
        String sql = "DELETE FROM user WHERE id = ?";
        int count = jdbcTemplate.update(sql, new Object[]{id});
        return count;
    }

}
