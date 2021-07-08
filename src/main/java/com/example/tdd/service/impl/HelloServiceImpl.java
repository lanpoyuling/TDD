package com.example.tdd.service.impl;

import com.example.tdd.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @ClassName HelloServiceImpl
 * @Author 10932
 * @Date 7/8/2021 10:41 AM
 **/
@Service
public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHello() {
        return MSG;
    }
}
