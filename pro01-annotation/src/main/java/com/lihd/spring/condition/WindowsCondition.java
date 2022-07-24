package com.lihd.spring.condition;


import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;


import java.lang.annotation.Annotation;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/23 22:44
 */
public class WindowsCondition implements Condition {

    /*
    ConditionContext context, 判断条件能使用的上下文环境
    AnnotatedTypeMetadata metadata 注释信息
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //1获取BeanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //2 获取类加载器
        ClassLoader classLoader = context.getClassLoader();
        //3获取当前环境
        Environment environment = context.getEnvironment();
        //4 获取Bean定义的注册类
        BeanDefinitionRegistry registry = context.getRegistry();

        String osName = environment.getProperty("os.name");

        if(osName.toLowerCase().contains("windows")){
            return true;
        }
        return false;
    }
}
