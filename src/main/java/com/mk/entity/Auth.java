package com.mk.entity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

public class Auth
{
    private String name;


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}
