package com.lihd.spring.junit;

import com.lihd.spring.config.TxConfig;
import com.lihd.spring.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/26 15:09
 */
public class TxTest {


    @Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);

        UserService userService = context.getBean(UserService.class);

        userService.addUser();

    }

    @Test
    public void test02(){
        int syntaxProcessor = 10;
    }

}
