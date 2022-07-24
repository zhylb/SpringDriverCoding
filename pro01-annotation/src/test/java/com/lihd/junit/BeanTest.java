package com.lihd.junit;

import com.lihd.spring.config.BeanConfig;
import com.lihd.spring.config.BeanConfig2;
import com.lihd.spring.pojo.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/23 10:08
 */
public class BeanTest {


    @Test
    public void testGetBeanByXml(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        Person bean = context.getBean(Person.class,"person");
        System.out.println(bean);
    }


    @Test
    public void testGetBeanByAnnotation(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Person person = context.getBean(Person.class, "person");

        String[] type = context.getBeanNamesForType(Person.class);


        System.out.println(person);

        for (String s : type) {
            System.out.println(s);
        }

    }

    @Test
    public void testComponentScan(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }

    }


    @Test
    public void testScope(){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig2.class);

        System.out.println("容器加载完毕");

        Object person1 = context.getBean("person");
        Object person2 = context.getBean("person");

        System.out.println(person1 == person2);

//        Person person1 = context.getBean(Person.class, "person");
//        Person person2 = context.getBean(Person.class, "person");
//
//        System.out.println(person1 == person2);
    }


    @Test
    public void testConditional(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig2.class);


        ConfigurableEnvironment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);

        String[] beanNamesForType = context.getBeanNamesForType(Person.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }


        Map<String, Person> beansOfType = context.getBeansOfType(Person.class);
        System.out.println(beansOfType);



    }

    @Test
    public void testImport(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig2.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String s : beanDefinitionNames) {
            System.out.println(s);
        }



    }

    @Test
    public void testBeanFactory(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig2.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String s : beanDefinitionNames) {
            System.out.println(s);
        }
        System.out.println("--------------------------------------");
        Object colorFactory1 = context.getBean("colorFactory");
        Object colorFactory2 = context.getBean("colorFactory");

        System.out.println(colorFactory1 == colorFactory2);
        System.out.println(colorFactory1.getClass().getSimpleName());
    }

}
