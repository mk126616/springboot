package com.mk.springbootListener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * 项目启动的监听器
 */
public class MyApplicationRunListener implements SpringApplicationRunListener
{
    public MyApplicationRunListener(SpringApplication application, String... str)
    {

    }

    @Override
    public void starting()
    {
        System.out.println("MyApplicationRunListener->starting被执行");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment)
    {
        System.out.println("MyApplicationRunListener->environmentPrepared被执行");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context)
    {
        System.out.println("MyApplicationRunListener->contextPrepared被执行");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context)
    {
        System.out.println("MyApplicationRunListener->contextLoaded被执行");
    }

    @Override
    public void finished(ConfigurableApplicationContext context, Throwable exception)
    {
        System.out.println("MyApplicationRunListener->finished被执行");
    }
}
