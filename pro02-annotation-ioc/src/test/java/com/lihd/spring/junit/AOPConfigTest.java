package com.lihd.spring.junit;

import com.lihd.spring.aop.HelloAop;
import com.lihd.spring.config.AOPConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/25 16:25
 */
public class AOPConfigTest {
    @Test
    public void testAOP(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AOPConfig.class);

        HelloAop helloAop = context.getBean(HelloAop.class);

        helloAop.getStr("ha",3);
    }

    @Test
    public void printAll(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AOPConfig.class);
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }


}
