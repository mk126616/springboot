package com.mk.configration;

import com.alibaba.druid.pool.DruidDataSource;
import com.mk.entity.Auth;
import com.mk.entity.Dept;
import com.mk.entity.Role;
import com.mk.entity.User;
import org.springframework.aop.framework.AopContext;
import org.springframework.aop.framework.autoproxy.ProxyCreationContext;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Configuration   //当前配置类启用代理(cglb ConfigurationClassEnhancer的intercept方法中直接使用代理对象调用super方法，
// 所以启用代理后此类中this指向代理对象，此类中的@Bean方法可以相互调用获取的都是ioc中同一个对象)
public class MyConfig
{
//    private User user;
//
//    private Dept dept;
//
//    //spring注解式声明一个组件时，实例化该配置类时会参数会直接在ioc容器中拿对应类型的bean
//    public MyConfig(User user, Dept dept)
//    {
//        this.user = user;
//        this.dept = dept;
//    }

    @Bean
    public Auth auth()
    {
        return new Auth();
    }

    @Bean
    public Role role()
    {
        Role role = new Role();
        return role;
    }


}
