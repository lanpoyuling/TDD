package com.example.tdd.controller;

import com.example.tdd.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName HelloController
 * @Author 10932
 * @Date 7/8/2021 10:35 AM
 **/
@RestController
@RequestMapping("api")
public class HelloController {


    @Resource
    private HelloService helloService;

    @RequestMapping("hello")
    public String hello() {

        return helloService.sayHello();
    }
}
