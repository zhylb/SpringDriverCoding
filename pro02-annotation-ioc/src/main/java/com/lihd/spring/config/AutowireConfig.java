package com.lihd.spring.config;

import com.lihd.spring.bean.Book;
import com.lihd.spring.bean.Cart;
import com.lihd.spring.dao.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 自动装配 Spring使用依赖注入DI完成对IOC容器中各个组件的依赖关系进行赋值
 * 1@Autowired 自动注入
 *      1.1 默认优先按照类型去容器中找对应的组件
 *      1.2 如果没找到报错 可以通过设置 required = false设置不是必须装配
 *      1.3 如果找到了多个并且有一个设置了优先级@primary：那么使用此对象装配
 *      1.4 如果找到多个且都没有设置优先级 ：根据属性名 查找id为属性名的对象进行赋值
 *      1.5 可以使用在@Autowired 上使用 @Qualifier指定要使用的对象id是什么
 *          会先根据类型查找 再根据id查找 没有找到报错（没有设置required = false）
 *          如果配置了这个 1.3 1.4 规则失效
 * 2
 *
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/24 15:59
 */
@Configuration
@ComponentScan(basePackages = "com.lihd.spring")
public class AutowireConfig {


    @Bean
    public Cart cart(Book book){
        Cart cart = new Cart();
        cart.setBook(book);
        return cart;
    }


    @Primary
    @Bean("bookDAO2")
    public BookDAO bookDAO(){
        BookDAO bookDAO = new BookDAO();
        bookDAO.setBookModel("green");
        return bookDAO;
    }


}
