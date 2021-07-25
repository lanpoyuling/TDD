package com.example.tdd;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * @ClassName TxtReaderTest
 * @Description 文本读取测试
 * @Author 10932
 * @Date 7/18/2021 5:23 PM
 **/

public class TxtReaderTest {
    private Logger logger = LoggerFactory.getLogger(TxtReaderTest.class);


    @Test
    void test_read_txt() {
        readTxt("D:\\idea-project\\gitlab\\switch\\src\\main\\java\\generate\\new 2.txt");
    }

    /**
     * 读取文本
     * try-with-resource语句使用
     *
     * @param fileName 文件完整路径
     * @author 1093
     * @date 7/24/2021 1:14 PM
     */
    private void readTxt(String fileName) {
        try (
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                logger.info("{}", s);
            }
        } catch (FileNotFoundException e) {
            logger.error("{}", e.getMessage(), e);
        } catch (IOException e) {
            logger.error("{}", e.getMessage(), e);
        }
    }


}
