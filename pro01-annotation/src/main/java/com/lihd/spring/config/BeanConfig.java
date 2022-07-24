package com.lihd.spring.config;

import com.lihd.spring.controller.MyTypeFilter;
import com.lihd.spring.dao.BookDAO;
import com.lihd.spring.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/23 9:46
 */

/*//排除部分的 组件
@ComponentScan(basePackages = "com.lihd.spring",
        excludeFilters = {@ComponentScan.Filter( type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})}
)*/
@ComponentScan(basePackages = "com.lihd.spring",
        useDefaultFilters = false,
        includeFilters = {
//                @ComponentScan.Filter( type = FilterType.ANNOTATION,classes = {Controller.class}),
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookDAO.class}),
                @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})
        }
)
@Configuration
public class BeanConfig {


    //给容器注册一个Bean 类型为 返回值类型 ，id默认为方法名 可以通过name属性修改方法名的id
    @Bean(name = "person001")
    public Person person01(){
        return new Person("张飞",62);
    }
}
