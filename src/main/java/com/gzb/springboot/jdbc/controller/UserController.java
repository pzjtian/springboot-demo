package com.gzb.springboot.jdbc.controller;

import com.gzb.springboot.jdbc.dao.UserDao;
import com.gzb.springboot.jdbc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/getList")
    public List<User> getUserList(){
        return userDao.getList();
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        userDao.add(user);
        return "添加成功";
    }
}
