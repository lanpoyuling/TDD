package com.example.tdd.util.computation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @ClassName ComputationTest
 * @Description 数学运算测试
 * @Author 10932
 * @Date 7/25/2021 10:35 AM
 **/
public class ComputationTest implements BaseComputationalData {

    @ParameterizedTest
    @MethodSource("testMinusData")
    void when_given_two_number_then_return_int(int excepted, int number1, int number2) {
        assertThat(excepted).isEqualTo(number1 - number2);
    }

    @ParameterizedTest
    @MethodSource("testDivideData")
    void when_given_two_number_then_return_bigDecimal(BigDecimal excepted, int number1, int number2) {
        assertThat(excepted).isEqualTo(new BigDecimal(String.valueOf(number1)).divide(new BigDecimal(number2), 2, RoundingMode.HALF_UP));
    }
}
