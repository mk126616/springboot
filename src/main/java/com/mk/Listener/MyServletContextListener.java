package com.mk.Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener
{
    public  void contextInitialized(ServletContextEvent sce) {
        System.out.println("项目启动");
    }

    public  void contextDestroyed(ServletContextEvent sce) {
        System.out.println("项目停止");
    }
}
