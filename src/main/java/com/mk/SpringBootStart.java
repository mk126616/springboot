package com.mk;

import com.mk.configration.ExtendTest;
import com.mk.entity.User;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.security.auth.login.Configuration;

/**
 * 配置类可以有多个，但是主配置类（有main方法的配置类）只能有一个
 * springboot主配置类
 */
@MapperScan("com.mk.mapper")  //批量指定mapper接口扫描
//@ImportResource("classpath:spring-bean.xml")
@SpringBootApplication(scanBasePackages = "com.mk")
public class SpringBootStart
{
    private static Logger logger = LoggerFactory.getLogger(SpringBootStart.class);
    public static void main(String[] args)
    {
        //run方法中会创建SpringApplication的实例，将SpringBootStart配置类设置到SpringApplication实例化的对象的source属性上，
        // SpringApplication实例化的对象中的run方法中解析配置类上的注解进行spring配置
        ConfigurableApplicationContext context =  SpringApplication.run(SpringBootStart.class, args);
        logger.debug("springboot启动成功");
    }
}
