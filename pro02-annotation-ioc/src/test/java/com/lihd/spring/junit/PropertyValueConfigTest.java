package com.lihd.spring.junit;

import com.lihd.spring.bean.Person;
import com.lihd.spring.config.PropertyValueConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/24 15:39
 */
public class PropertyValueConfigTest {

    @Test
    public void testValue(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PropertyValueConfig.class);
        Person bean = context.getBean(Person.class);
        System.out.println(bean);
        ConfigurableEnvironment environment = context.getEnvironment();
        String sex = environment.getProperty("person.sex");
        String property = environment.getProperty("os.name");
        System.out.println(sex);
        System.out.println(property);
    }
}
