package com.tsign.demo.generator.umps.entity;

import lombok.Data;

/**
 * @author lvfei
 * @since 2020/9/19 4:27 下午
 */
@Data
public class Greeting {

    private Long id;
    private String name;

    public Greeting(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
