package com.example.tdd;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.IOException;

@SpringBootTest(classes = TddApplication.class)
class Base64ToolTest {
    private static final Logger logger = LoggerFactory.getLogger(Base64ToolTest.class);
    @Resource
    private Base64Tool base64Tool;
    @Test
    void encryptToBase64() throws IOException {
        String s = base64Tool.encryptToBase64("D:\\idea-project\\TDD\\src\\main\\java\\com\\example\\tdd\\Hello.class");
        logger.info("{}",s);
    }

    @Test
    void name() {
        byte[] base64Arr = base64Tool.decode("yv66vgAAADQAHAoABgAOCQAPABAIABEKABIAEwcAFAcAFQEABjxpbml0PgEAAygpVgEABENvZGUBAA9MaW5lTnVtYmVyVGFibGUBAAg8Y2xpbml0PgEAClNvdXJjZUZpbGUBAApIZWxsby5qYXZhDAAHAAgHABYMABcAGAEAGEhlbGxvIENsYXNzIEluaXRpYWxpemVkIQcAGQwAGgAbAQAVY29tL2V4YW1wbGUvdGRkL0hlbGxvAQAQamF2YS9sYW5nL09iamVjdAEAEGphdmEvbGFuZy9TeXN0ZW0BAANlcnIBABVMamF2YS9pby9QcmludFN0cmVhbTsBABNqYXZhL2lvL1ByaW50U3RyZWFtAQAHcHJpbnRsbgEAFShMamF2YS9sYW5nL1N0cmluZzspVgAhAAUABgAAAAAAAgABAAcACAABAAkAAAAdAAEAAQAAAAUqtwABsQAAAAEACgAAAAYAAQAAAAkACAALAAgAAQAJAAAAJQACAAAAAAAJsgACEgO2AASxAAAAAQAKAAAACgACAAAADQAIAA4AAQAMAAAAAgAN");
        for (byte b : base64Arr) {
            logger.info("{}",b);
        }
    }
}
