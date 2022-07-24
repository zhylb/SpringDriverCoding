package com.lihd.spring.config;

import com.lihd.spring.aop.HelloAop;
import com.lihd.spring.aop.MyLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/25 16:10
 */
@Configuration
@EnableAspectJAutoProxy
public class AOPConfig {

    @Bean
    public HelloAop helloAop(){
        return new HelloAop();
    }

    @Bean
    public MyLogger myLogger(){
        return new MyLogger();
    }

}
