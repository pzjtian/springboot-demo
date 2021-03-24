package com.gzb.springboot.jdbc.dao;


import com.gzb.springboot.jdbc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getList() {
        return jdbcTemplate.query("select * from tb_user",new Object[]{},new BeanPropertyRowMapper(User.class));
    }

    @Override
    public int add(User user) {
        return jdbcTemplate.update("insert into tb_user(user_name,user_address,age) values(?,?,?)",user.getUserName(),user.getUserAddress(),user.getAge());
    }
}
