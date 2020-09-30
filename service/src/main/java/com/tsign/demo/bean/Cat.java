package com.tsign.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author lvfei
 * @since 2020/9/30 3:05 下午
 */
@Component
public class Cat {

    @Autowired
    private Person person;

    private String name;

    private Person master;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getMaster() {
        return master;
    }

    public void setMaster(Person master) {
        this.master = master;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "person=" + person +
                ", name='" + name + '\'' +
                ", master=" + master +
                '}';
    }
}
