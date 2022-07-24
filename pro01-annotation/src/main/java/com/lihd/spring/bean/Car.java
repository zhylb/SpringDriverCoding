package com.lihd.spring.bean;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/24 9:12
 */
public class Car {
    public Car() {
        System.out.println("对象被创建");
    }

    public void init(){
        System.out.println("连接池 线程池的开启工作 代码量很大");
    }

    public void destroy(){
        System.out.println("连接池线程池关闭的操作 否则会导致内存泄露");
    }
}
