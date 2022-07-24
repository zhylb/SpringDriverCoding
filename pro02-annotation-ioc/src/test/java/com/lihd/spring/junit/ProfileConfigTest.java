package com.lihd.spring.junit;

import com.lihd.spring.bean.Book;
import com.lihd.spring.config.ProfileConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/25 14:57
 */
public class ProfileConfigTest {

    @Test
    public void getAllName(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProfileConfig.class);

        for (String s : context.getBeanNamesForType(DataSource.class)) {
            System.out.println(s);
        }
    }


    @Test
    public void getAllName2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("test","dev");
        context.register(ProfileConfig.class);
        context.refresh();

        for (String s : context.getBeanNamesForType(DataSource.class)) {
            System.out.println(s);
        }

        Book book = context.getBean(Book.class);
        System.out.println(book);
    }
}
