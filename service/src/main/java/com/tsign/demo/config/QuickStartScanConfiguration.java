package com.tsign.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author lvfei
 * @since 2020/9/30 3:27 下午
 */
@Configuration
@ComponentScan("com.tsign.demo.bean")
@PropertySource("classpath:base_dl/value/red.properties")
public class QuickStartScanConfiguration {

}
