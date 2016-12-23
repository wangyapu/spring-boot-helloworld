package com.wyp.mapper;

import com.wyp.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    long insert(User user);

    List<User> findUserInfo();
}