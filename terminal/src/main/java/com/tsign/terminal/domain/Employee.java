package com.tsign.terminal.domain;

import lombok.Data;

/**
 * @author fei lv
 * @version 1.0
 * @since 2020/9/17 1:58 下午
 */
@Data
public class Employee {

    private Long id;
    private String name;
    private Integer age;
    private String email;
}
