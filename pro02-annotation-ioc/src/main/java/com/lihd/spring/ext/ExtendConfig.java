package com.lihd.spring.ext;

import com.lihd.spring.bean.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/27 0:09
 */
@Configuration
@ComponentScan("com.lihd.spring.ext")
public class ExtendConfig {

    @Bean
    public Book book(){
        return new Book();
    }

}
