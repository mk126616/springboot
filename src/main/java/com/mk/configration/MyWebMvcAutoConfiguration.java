package com.mk.configration;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc  //让spring boot自带的所有mvc配置失效
@Configuration
public class MyWebMvcAutoConfiguration
{
}
