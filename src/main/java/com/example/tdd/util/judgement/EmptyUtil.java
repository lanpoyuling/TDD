package com.example.tdd.util.judgement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @ClassName com.example.tdd.util.judgement.EmptyUtil
 * @Description 判空工具
 * @Author 10932
 * @Date 7/25/2021 9:40 AM
 **/
public class EmptyUtil {
    public static final Logger logger = LoggerFactory.getLogger(EmptyUtil.class);


    static boolean objectUtilsIsEmpty(String trim) {
        return ObjectUtils.isEmpty(trim);
    }

    static boolean stringUtilsIsEmpty(String trim) {
        return StringUtils.isEmpty(trim);
    }

    static boolean collectionIsEmpty(List<?> list) {
        return ObjectUtils.isEmpty(list);
    }

    static boolean isEmpty(String param) {
        return null == param || param.trim().length() == 0;
    }

    static boolean isNotEmpty(String param) {
        return null != param && param.trim().length() > 0;
    }

    static boolean contains(String origin, String keyword) {
        if (isEmpty(origin)) {
            return false;
        }
        return origin.toLowerCase().contains(keyword);
    }
}
