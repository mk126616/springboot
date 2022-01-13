package com.mk.entity;

import com.mk.controller.UserController;

import com.mk.entity.User;
import com.sun.glass.ui.Application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = Application.class)
public class UserTest
{
    @Autowired
    private User user;
    @Autowired
    UserController controller;

    @Test
    public void userTest(){
        System.out.println(user);
    }
}
