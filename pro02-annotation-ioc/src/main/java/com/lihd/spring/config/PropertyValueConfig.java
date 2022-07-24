package com.lihd.spring.config;

import com.lihd.spring.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/24 15:39
 */
@Configuration
@PropertySource("classpath:person.properties")
public class PropertyValueConfig {
    @Bean
    public Person person(){
        return new Person();
    }

}
