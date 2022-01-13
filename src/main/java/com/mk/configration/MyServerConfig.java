package com.mk.configration;

import com.mk.Filter.MyFilter;
import com.mk.Listener.MyServletContextListener;
import com.mk.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.Arrays;


@Configuration
public class MyServerConfig
{
    /**
     * 给tomcat增加servlet
     */
//    @Bean
    public ServletRegistrationBean servletRegistrationBean()
    {
        ServletRegistrationBean servletRegistration = new ServletRegistrationBean();
        servletRegistration.setServlet(new MyServlet());
        String[] urlMapping = {"/myServlet"};
        servletRegistration.setUrlMappings(Arrays.asList(urlMapping));
        return servletRegistration;
    }

    /**
     * 给tomcat增加filter
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean()
    {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MyFilter());
        String[] urlMapping = {"/myFilter"};
        filterRegistrationBean.setUrlPatterns(Arrays.asList(urlMapping));
        return filterRegistrationBean;
    }

    /**
     * 给tomcat增加listener
     */
    @Bean
    public ServletListenerRegistrationBean listenerRegistrationBean()
    {
        return new ServletListenerRegistrationBean(new MyServletContextListener());
    }
}
