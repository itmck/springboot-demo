package com.qf.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//在要扫描的mapper上加上@Mapper注解.所以就不用在此使用@MapperScan.
//@MapperScan(value = "com.qf.springbootdemo.dao")//扫描这个包下的mapper
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

}
