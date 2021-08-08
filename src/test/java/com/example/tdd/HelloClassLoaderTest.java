package com.example.tdd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest(classes = TddApplication.class)
class HelloClassLoaderTest {
    @Resource
    HelloClassLoader helloClassLoader;
    @Value("${custom.className.hello}")
    private String className;

    @Test
    void findClass() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> aClass = helloClassLoader.findClass(className);
        Object o = aClass.newInstance();

    }
}
