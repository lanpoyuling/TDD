package com.example.tdd;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

/**
 * @ClassName Base64Tool
 * @Description Base64工具类
 * @Author 10932
 * @Date 8/8/2021 9:54 AM
 **/
@Component
public class Base64Tool {

    public String encryptToBase64(String filePath) throws IOException {
        if (null == filePath) {
            return null;
        }
        byte[] bytes = Files.readAllBytes(Paths.get(filePath));
        return Base64.getEncoder().encodeToString(bytes);
    }
    public byte[] decode(String base64) {
        return Base64.getDecoder().decode(base64);
    }
}
