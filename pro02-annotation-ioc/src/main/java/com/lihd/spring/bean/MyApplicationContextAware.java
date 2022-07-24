package com.lihd.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/24 22:56
 */
@Component
public class MyApplicationContextAware implements ApplicationContextAware, BeanNameAware, EnvironmentAware, EmbeddedValueResolverAware {

    //通过 方法回调的方式帮我们注入属性
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //在这里可以通过

    }

    @Override
    public void setBeanName(String name) {
        System.out.println("当前的名字" + name);
    }

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println(environment);
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String s = resolver.resolveStringValue("你好我是${os.name},我的年龄是#{14+4}");
        System.out.println(s);
    }
}
