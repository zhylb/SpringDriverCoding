package com.lihd.spring.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/24 10:00
 */
@Component
public class Dog {

    public Dog() {
        System.out.println("Dog.Dog");
    }

    @PostConstruct
    public void init(){
        System.out.println("Dog.@PostConstruct");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Dog.@PreDestroy");
    }

}
