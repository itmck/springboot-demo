package com.qf.springbootdemo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Create by it_mck 2018/11/10 17:06
 *
 * @Description:
 * @Version: 1.0
 */
@Component//把普通pojo实例化到spring容器中，相当于配置文件中的 <bean id="student" class="com.qf.springbootdemo.pojo.Student"/>
public class Student {
    @Value("${student.name}")
    private String name;
    @Value("${student.age}")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
