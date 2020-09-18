package com.tsign.service.map;

import com.tsign.service.po.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author fei lv
 * @version 1.0
 * @since 2020/9/12 4:25 下午
 */
public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("name"));
        user.setAge(resultSet.getInt("age"));
        user.setSex(resultSet.getString("sex"));
        return user;
    }


}
