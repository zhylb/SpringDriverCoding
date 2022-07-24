package com.lihd.spring.config;

import com.lihd.spring.condition.LinuxCondition;
import com.lihd.spring.condition.MyImportBeanDefinitionRegistrar;
import com.lihd.spring.condition.MyImportSelector;
import com.lihd.spring.condition.WindowsCondition;
import com.lihd.spring.pojo.Blue;
import com.lihd.spring.pojo.ColorFactory;
import com.lihd.spring.pojo.Green;
import com.lihd.spring.pojo.Person;
import org.springframework.context.annotation.*;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/23 21:23
 */
@Configuration
@Conditional({WindowsCondition.class})
@Import({Blue.class, Green.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class BeanConfig2 {
//    @Scope("prototype")
    @Bean(name = "person")
    @Lazy
    public Person getPerson(){
        System.out.println("对象被创建");
        return new Person("李画心",18);
    }



    @Conditional({WindowsCondition.class})
    @Bean
    public Person person01(){
        return new Person("Bill Gates",60);
    }


    @Conditional({LinuxCondition.class})
    @Bean
    public Person person02(){
        return new Person("linus",49);
    }


    @Bean
    public ColorFactory colorFactory(){
        return new ColorFactory();
    }


}
