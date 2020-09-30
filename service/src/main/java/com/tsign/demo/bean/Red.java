package com.tsign.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author lvfei
 * @since 2020/9/30 4:48 下午
 */
@Component
public class Red {

    @Value("${red.name}")
    private String name;
    @Value("${red.order}")
    private Integer order;

    @Override
    public String toString() {
        return "Red{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }
}
