package com.tsign.demo;

import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
class ServiceApplicationTests {

    @Resource
    private DataSource dataSource;

    @Test
    void contextLoads() {

    }

    //测试数据源DataSource是否配置成功
    @Test
    public void springDataSourceTests() {
        log.info("dataSource instanceof HikariDataSource:" + (dataSource instanceof HikariDataSource));
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");

            if (resultSet.next()) {
                log.info(resultSet.getString("id"));
                log.info(resultSet.getString("name"));
            }

            statement.close();
            connection.close();

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}
