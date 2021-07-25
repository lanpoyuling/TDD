package com.example.tdd.util;

import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @ClassName ExcelUtils
 * @Description Excel工具类
 * @Author 10932
 * @Date 7/24/2021 1:25 PM
 **/
public class ExcelUtils {
    private static final Logger logger = LoggerFactory.getLogger(ExcelUtils.class);


    protected static <E> List<E> readExcel(String excelFilePath, Class<E> clazz) {
        ImportParams params = new ImportParams();
        File file = new File(excelFilePath);
        List<E> list = null;
        try (InputStream fileInputStream = new FileInputStream(file)) {
            list = ExcelImportUtil.importExcelBySax(fileInputStream, clazz, params);
            logger.info("文件总记录数：{}", (long) Optional.ofNullable(list).orElse(new ArrayList<>()).size());
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        return list;
    }


}
