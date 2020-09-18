package com.tsign.service.base.service;

import com.tsign.service.po.User;

import java.util.List;

/**
 * @author fei lv
 * @version 1.0
 * @since 2020/9/12 4:41 下午
 */
public interface UserService {

    void createTable();

    void save(User user);

    List<User> getUser();
}
