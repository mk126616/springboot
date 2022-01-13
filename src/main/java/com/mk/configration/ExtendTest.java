package com.mk.configration;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.annotation.*;

@SpringBootApplication
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface ExtendTest
{
}
