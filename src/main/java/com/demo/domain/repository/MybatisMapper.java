package com.demo.domain.repository;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by zs on 16/10/24.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Component
public @interface MybatisMapper {
    String value() default "";
}