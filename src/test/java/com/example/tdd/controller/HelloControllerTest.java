package com.example.tdd.controller;

import com.example.tdd.TddApplication;
import com.example.tdd.service.HelloService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.annotation.Resource;
import java.nio.charset.Charset;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @ClassName HelloControllerTest
 * @Author 10932
 * @Date 7/8/2021 10:22 AM
 **/
@SpringBootTest(classes = TddApplication.class)
@AutoConfigureMockMvc
public class HelloControllerTest {
    private Logger logger = LoggerFactory.getLogger(HelloControllerTest.class);
    @Resource
    private MockMvc mockMvc;

    /**
     * 目标： 新建 api接口 /api/hello  访问结果： 你好 TDD
     *
     * @author 1093
     * @date 7/8/2021 10:23 AM
     */
    @Test
    void test_hello() throws Exception {
        String urlTemplate = "/api/hello";
        String contentAsString = getContentAsString(urlTemplate);
        assertThat(contentAsString).isEqualTo(HelloService.MSG);
    }

    private String getContentAsString(String urlTemplate) throws Exception {
        return this.mockMvc.perform(MockMvcRequestBuilders
                        .post(urlTemplate))
                .andReturn()
                .getResponse()
                .getContentAsString(Charset.defaultCharset());
    }
}
