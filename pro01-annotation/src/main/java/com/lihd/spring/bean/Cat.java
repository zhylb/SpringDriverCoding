package com.lihd.spring.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/24 9:56
 */
@Component
public class Cat implements InitializingBean, DisposableBean {

    public Cat() {
        System.out.println("Cat.Cat");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Cat.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Cat.afterPropertiesSet");
    }
}
