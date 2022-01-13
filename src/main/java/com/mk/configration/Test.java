package com.mk.configration;

import com.mk.controller.UserController;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import java.lang.annotation.Annotation;

@Component
public class Test implements BeanFactoryPostProcessor, BeanDefinitionRegistryPostProcessor
{
    @Autowired
    UserController userController;
    public Test(){
        int a =10;
    }
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException
    {
        int a = 10;
    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException
    {
        BeanDefinition beanDefinition = new AnnotatedGenericBeanDefinition(BeanCreate.class);
        beanDefinitionRegistry.registerBeanDefinition("beanCreate",beanDefinition);
    }

    //    @Override
//    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException
//    {
//        int a = 10;
//        return null;
//    }
//
//    @Override
//    public Object postProcessAfterInitialization(Object o, String s) throws BeansException
//    {
//        int a = 10;
//        return null;
//    }
//
//    @Override
//    public void initialize(ConfigurableApplicationContext configurableApplicationContext)
//    {
//        int a = 10;
//    }
}
