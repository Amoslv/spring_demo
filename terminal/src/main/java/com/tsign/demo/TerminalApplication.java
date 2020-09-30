package com.tsign.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@SpringBootApplication()
@Slf4j
public class TerminalApplication  {

    public static void main(String[] args) {
        SpringApplication.run(TerminalApplication.class, args);

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext();


    }


}
