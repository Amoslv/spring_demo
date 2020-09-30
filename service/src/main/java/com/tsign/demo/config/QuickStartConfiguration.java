package com.tsign.demo.config;

import com.tsign.demo.bean.Cat;
import com.tsign.demo.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lvfei
 * @since 2020/9/30 2:51 下午
 */
//@Configuration
public class QuickStartConfiguration {

//        @Bean
    public Person person() {
//        Person person = new Person();
//        person.setAge(28);
//        person.setName("小红");
//        return person;
//        return new Person("xiaohong", 19);
        return null;
    }

//        @Bean
    public Cat cat() {
        Cat cat = new Cat();
        cat.setName("旺财");
        cat.setMaster(person());
        return cat;
    }
}
