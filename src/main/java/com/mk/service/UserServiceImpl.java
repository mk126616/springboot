package com.mk.service;

import com.mk.Mapper.UserMapper;
import com.mk.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserMapper userMapper;
    @Override
    public String test()
    {
        return "hello word！";
    }

    @Override
    public List<User> getUsers()
    {
        return userMapper.getUsers();
    }

    @Override
    public List<User> getUsers2()
    {
        return userMapper.getUsers2();
    }

}
