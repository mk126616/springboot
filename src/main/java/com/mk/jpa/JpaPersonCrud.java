package com.mk.jpa;

import com.mk.entity.JpaTestPerson;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * jpa访问
 * 底层为动态代理
 */
public interface JpaPersonCrud extends JpaRepository<JpaTestPerson,Integer>
{
}
