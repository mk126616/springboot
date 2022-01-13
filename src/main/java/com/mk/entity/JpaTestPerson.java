package com.mk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * spring-data-jpa测试
 */
@Entity  //标识当前类为一个jpa数据库字段与实体映射类
@Table(name = "jpa_test_person")
public class JpaTestPerson
{
    @Id //标识主键
    private Integer id;

    @Column(name="name")
    private String name;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
