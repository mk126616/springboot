package com.mk.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;

//@Component
//@PropertySource("classpath:user.properties") //指定配置文件
//@ConfigurationProperties(prefix = "user")  //绑定属性和配置项前缀
public class User
{
    private int id;
    private String name;
    private int age;
    private Dept dept;
    private List<String> list;
    private Map<String,Object> map;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Dept getDept()
    {
        return dept;
    }

    public void setDept(Dept dept)
    {
        this.dept = dept;
    }

    public List<String> getList()
    {
        return list;
    }

    public void setList(List<String> list)
    {
        this.list = list;
    }

    public Map<String, Object> getMap()
    {
        return map;
    }

    public void setMap(Map<String, Object> map)
    {
        this.map = map;
    }

    @Override
    public String toString()
    {
        return "User{" + "name='" + name + '\'' + ", age=" + age + ", dept=" + dept + ", list=" + list + ", map=" + map + '}';
    }
}
