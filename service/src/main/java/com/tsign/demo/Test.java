package com.tsign.demo;

import com.tsign.demo.bean.Cat;
import com.tsign.demo.bean.Person;
import com.tsign.demo.bean.Red;
import com.tsign.demo.config.QuickStartConfiguration;
import com.tsign.demo.config.QuickStartScanConfiguration;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.Stream;

/**
 * @author lvfei
 * @since 2020/9/19 5:07 下午
 */
public class Test {

    public static void main(String[] args) {
//        BeanFactory applicationContext = new ClassPathXmlApplicationContext("base_dl/inject-set.xml");
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(QuickStartConfiguration.class);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(QuickStartScanConfiguration.class);

        Person person = (Person) applicationContext.getBean("person");

        System.out.println(person);

        Cat cat = applicationContext.getBean(Cat.class);
        System.out.println(cat);

//        String[] beanNames = applicationContext.getBeanDefinitionNames();
//        Stream.of(beanNames).forEach(System.out::println);

        Red red = applicationContext.getBean(Red.class);
        System.out.println(red);
    }
}
