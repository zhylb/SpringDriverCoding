package com.lihd.spring.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/24 15:37
 */
public class Person {
    /*
    给属性赋值三种方式
    1 直接写值
    2 使用spEL #{}
    3 使用${} 这种方式需要在配置类上加上类似于 @PropertySource("classpath:person.properties")
     */


    @Value("徐盛")
    private String name;

    @Value("#{42-18}")
    private Integer age;

    @Value("${person.sex}")
    private String sex;

    public Person() {
    }

    public Person(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
