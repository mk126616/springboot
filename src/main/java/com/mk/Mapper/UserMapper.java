package com.mk.Mapper;

import com.mk.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper  注解式指定单个mapper接口
public interface UserMapper
{
    @Select("select id,name from user")
    List<User> getUsers();

    List<User> getUsers2();
}
