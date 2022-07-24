package com.lihd.spring.junit;

import com.lihd.spring.bean.Book;
import com.lihd.spring.bean.Cart;
import com.lihd.spring.bean.User;
import com.lihd.spring.config.AutowireConfig;
import com.lihd.spring.controller.BookController;
import com.lihd.spring.dao.BookDAO;
import com.lihd.spring.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/24 16:00
 */
public class AutowireConfigTest {


    @Test
    public void getBeanDefinitionName(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutowireConfig.class);

        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }

    }

    @Test
    public void testAutowire(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutowireConfig.class);
        BookService bookService = context.getBean(BookService.class);
        //BookDAO bookDAO = (BookDAO) context.getBean("bookDAO");
        System.out.println(bookService);
        //System.out.println(bookDAO);
    }

    @Test
    public void testAutowire2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutowireConfig.class);
        BookController bean = context.getBean(BookController.class);

        System.out.println(bean);
    }


    @Test
    public void testAutowire3(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutowireConfig.class);
        User user = context.getBean(User.class);
        Book book = context.getBean(Book.class);
        Cart cart = context.getBean(Cart.class);


        System.out.println(user);
        System.out.println(book);
        System.out.println(cart);
    }

}
