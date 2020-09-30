package com.tsign.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author lvfei
 * @since 2020/9/30 2:56 下午
 */
@Component
public class Person {

    @Value("person_xiaohong")
    private String name;

    @Value("21")
    private Integer age;

//    public Person(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
