package com.mk.springbootListener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/***
 *上下文的初始化器（在prepareContext()方法中被调用）
 */
public class MyApplicationContextInitializer implements ApplicationContextInitializer
{
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext)
    {
        System.out.println("MyApplicationContextInitializer->initialize被执行");
    }
}
