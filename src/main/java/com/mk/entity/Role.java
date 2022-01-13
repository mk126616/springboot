package com.mk.entity;

public class Role
{
    private String  name;
    private Auth auth;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Auth getAuth()
    {
        return auth;
    }

    public void setAuth(Auth auth)
    {
        this.auth = auth;
    }
}
