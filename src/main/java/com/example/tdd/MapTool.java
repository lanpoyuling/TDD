package com.example.tdd;

import cn.hutool.core.lang.Assert;

import java.util.HashMap;

/**
 * @ClassName MapTool
 * @Description 初始化Map
 * @Author 10932
 * @Date 7/25/2021 5:20 PM
 **/
public class MapTool {
    public static <K, V> HashMap<K, V> newHashMapWithExpectedSize(int expectedSize) {
        return new HashMap(capacity(expectedSize));
    }


    static int capacity(int expectedSize) {
        Assert.isTrue(expectedSize > 0, "参数必须为正整数");
        if (expectedSize < 3) {
            return expectedSize + 1;
        }
        return expectedSize < 1073741824 ? (int) ((float) expectedSize / 0.75F
                + 1.0F) : 2147483647;

    }

}
