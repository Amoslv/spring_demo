package com.tsign.demo;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class TerminalApplicationTests {

    @Resource
//    IEmployeeService employeeMapper;

    @Test
    void contextLoads() {
        System.out.println("-------- selectAll user method test --------");
//        Employee employee = new Employee();
//        employee.setId(6L);
//        employee.setAge(24);
//        employee.setName("hong");
//        employee.setEmail("test6@tsign.com");
//        employeeMapper.updateById(employee);
//
//        List<Employee> employeeList = employeeMapper.list();
//
//        employeeList.forEach(System.out::println);
    }

}
