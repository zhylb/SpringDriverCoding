package com.lihd.spring.config;

import com.lihd.spring.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/24 9:11
 */
@Configuration
@ComponentScan(basePackages = "com.lihd.spring.bean")
public class BeanConfigLifeCircle {


    /*
    对于单例对象
    1 创建 :容器初始化时
    2 init:对象创建完成 参数赋值成功后
    3 destroy:容器关闭的时候调用
    对于多例对象
    1 创建 :使用时创建，每次使用都会创建
    2 init：对象创建完成 参数赋值成功后
    3 销毁 ：IOC容器不管理 ，需要手动调用destroy方法
     */
//    @Scope("prototype")
    @Bean(name = "car",initMethod = "init",destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }

}
