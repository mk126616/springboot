package com.mk.Filter;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter
{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException
    {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
    {
        System.out.println("我的自定义过滤器被调用");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy()
    {

    }
}
