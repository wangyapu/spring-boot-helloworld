package com.wyp.service;

import com.wyp.entity.User;
import com.wyp.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Resource
    private UserMapper userMapper;

    public List<User> getUserInfo() {
        List<User> user = userMapper.findUserInfo();
        return user;
    }

    public boolean addUser(User user) {
        long id = userMapper.insert(user);
        return id > 0 ? true : false;
    }

}