package com.mk.controller;

import com.mk.entity.JpaTestPerson;
import com.mk.entity.User;
import com.mk.jpa.JpaPersonCrud;
import com.mk.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@RestController
public class UserController
{
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;
    @Autowired
    private JpaPersonCrud jpaPersonCrud;

    @Autowired
    private RabbitTemplate rabbitTemplate;


    @GetMapping("/test")
    public String test(){
        logger.warn("/user/test接口 被请求");
        return userService.test();
    }
    @GetMapping("/users")
    public List<User> getUsers() throws SQLException
    {
        return userService.getUsers();
    }

    @GetMapping("/users2")
    public List<User> getUsers2() throws SQLException
    {
        return userService.getUsers2();
    }
    @GetMapping("/jpa/persons")
    public List<JpaTestPerson> jpaPersons() throws SQLException
    {
        return jpaPersonCrud.findAll();
    }


    @GetMapping("/sendRabbitmqMsg")
    public String sendRabbitmqMsg(){
        rabbitTemplate.convertAndSend("priorityExchange","priority-routing-key","消息");
        return "发送成功";
    }

}
