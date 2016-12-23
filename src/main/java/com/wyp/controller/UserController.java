package com.wyp.controller;

import com.wyp.entity.User;
import com.wyp.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@EnableAutoConfiguration
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService service;

    @RequestMapping("/{id}")
    public User view(@PathVariable("id") long id) {
        User user = new User();
        user.setId(id);
        user.setName("wyp");
        return user;
    }

    @RequestMapping("/show")
    public List<User> show() {
        return service.getUserInfo();
    }

    @RequestMapping("/add")
    public boolean add() {
        User user = new User();
        user.setName("wyp");
        return service.addUser(user);
    }

    public static void main(String[] args) {
        SpringApplication.run(UserController.class);
    }
}
