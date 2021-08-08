package com.example.tdd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ClassName HelloClassLoader
 * @Description 自定义类加载器
 * @Author 10932
 * @Date 8/8/2021 10:02 AM
 **/
@Component
public class HelloClassLoader extends ClassLoader {
    @Value("${custom.base64.hello}")
    private String helloBase64;
    @Resource
    private Base64Tool base64Tool;

    @Override
    protected Class<?> findClass(String name) {
        byte[] decode = base64Tool.decode(helloBase64);
        return defineClass(name, decode, 0, decode.length);
    }
}
