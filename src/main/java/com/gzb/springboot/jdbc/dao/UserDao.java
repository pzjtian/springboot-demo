package com.gzb.springboot.jdbc.dao;

import com.gzb.springboot.jdbc.model.User;

import java.util.List;

public interface UserDao {

    List<User> getList();
    int add(User user);
}
