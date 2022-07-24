package com.lihd.spring.condition;

import com.lihd.spring.pojo.Yellow;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/24 0:02
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /*
    AnnotationMetadata importingClassMetadata, 老朋友
    BeanDefinitionRegistry registry 注册类 把要添加的类放入其中
     */

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        BeanDefinition b;

        RootBeanDefinition definition = new RootBeanDefinition(Yellow.class);

        registry.registerBeanDefinition("yellow",definition);
    }
}
