package com.lihd.junit;

import com.lihd.spring.config.BeanConfigLifeCircle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/24 9:11
 */
public class BeanLifeCircleTest {

    @Test
    public void testInitDestroy(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigLifeCircle.class);

        System.out.println("IOC容器初始化完成");

        Object car1 = context.getBean("car");
        Object car2 = context.getBean("car");

        System.out.println(car1 == car2);

        context.close();
    }

    @Test
    public void testLife(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigLifeCircle.class);

        System.out.println("--------------");

        context.close();
    }
}
