package com.example.tdd.service;

import com.example.tdd.TddApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest(classes = TddApplication.class)
class HelloServiceTest {
    @Resource
    private HelloService helloService;


    @Test
    void test_say_hello() {
        String sayHello = helloService.sayHello();
        assertThat(sayHello).isEqualTo(HelloService.MSG);
    }
}
