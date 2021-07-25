package com.example.tdd;

import org.junit.jupiter.params.provider.Arguments;

import java.math.BigDecimal;
import java.util.stream.Stream;

/**
 * @ClassName BaseData
 * @Description 基础数据
 * @Author 10932
 * @Date 7/25/2021 10:33 AM
 **/
public interface BaseData {
    static Stream<Arguments> testMinusData() {
        return Stream.of(
                Arguments.of(40, 340, 300),
                Arguments.of(80, 580, 500),
                Arguments.of(200, 1200, 1000),
                Arguments.of(500, 2500, 2000),
                Arguments.of(1000, 5000, 4000)
        );
    }

    static Stream<Arguments> testDivideData() {
        return Stream.of(
                Arguments.of(new BigDecimal("0.13"), 40, 300),
                Arguments.of(new BigDecimal("0.16"), 80, 500),
                Arguments.of(new BigDecimal("0.15"), 75, 500),
                Arguments.of(new BigDecimal("0.16"), 80, 500),
                Arguments.of(new BigDecimal("0.20"), 200, 1000),
                Arguments.of(new BigDecimal("0.25"), 500, 2000),
                Arguments.of(new BigDecimal("0.25"), 1000, 4000)
        );

    }
}
