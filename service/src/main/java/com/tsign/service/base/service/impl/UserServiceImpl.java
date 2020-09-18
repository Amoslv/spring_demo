package com.tsign.service.base.service.impl;

import com.tsign.service.base.service.UserService;
import com.tsign.service.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;

/**
 * @author fei lv
 * @version 1.0
 * @since 2020/9/12 4:43 下午
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    //    public void setDataSource(DataSource dataSource) {
//        this.jdbcTemplate = new JdbcTemplate(dataSource);
//    }
    @Override
    public void createTable() {
        jdbcTemplate.execute("CREATE TABLE `user` (" +
                "  `id` int(11) NOT NULL AUTO_INCREMENT," +
                "  `name` varchar(255) DEFAULT NULL," +
                "  `age` int(11) DEFAULT NULL," +
                "  `sex` varchar(255) DEFAULT NULL," +
                "  PRIMARY KEY (`id`)" +
                ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");
    }

    @Override
    public void save(User user) {
        jdbcTemplate.update("insert into USER(name, age, sex) values (?, ?, ?)",
                new Object[]{user.getName(), user.getAge(), user.getSex()},
                new int[]{Types.VARCHAR, Types.INTEGER, Types.VARCHAR});
    }

    @Override
    public List<User> getUser() {
        return null;
    }
}
