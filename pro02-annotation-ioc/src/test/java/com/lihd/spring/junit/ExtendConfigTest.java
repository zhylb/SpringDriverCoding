package com.lihd.spring.junit;

import com.lihd.spring.ext.ExtendConfig;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/27 0:15
 */
public class ExtendConfigTest {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ExtendConfig.class);

//        annotationConfigApplicationContext.addApplicationListener(new ApplicationListener<ApplicationEvent>() {
//            @Override
//            public void onApplicationEvent(ApplicationEvent event) {
//
//            }
//        });

        annotationConfigApplicationContext.publishEvent(new ApplicationEvent("我的publishEvent") {

        });

        annotationConfigApplicationContext.close();

    }
}
