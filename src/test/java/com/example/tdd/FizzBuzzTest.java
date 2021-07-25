package com.example.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @ClassName FizzBuzzTest
 * @Description FizzBuzz测试类
 * @Author 10932
 * @Date 6/29/2021 3:24 PM
 * 写一个程序，输出从 1 到 n 数字的字符串表示。
 * <p>
 * 1. 如果n是3的倍数，输出“Fizz”；
 * <p>
 * 2. 如果n是5的倍数，输出“Buzz”；
 * <p>
 * 3.如果n同时是3和5的倍数，输出 “FizzBuzz”。
 * <p>
 **/
public class FizzBuzzTest extends AbstractFizzBuzzTest {

    @Test
    void when_given_zero_should_throw_exception() {
        assertEquals(FizzBuzz.NUMBER_MUST_GREATER_THAN_0, assertThrows(IllegalArgumentException.class, () -> new FizzBuzz().of(0)).getMessage());
        assertEquals(FizzBuzz.NUMBER_MUST_GREATER_THAN_0, assertThrows(IllegalArgumentException.class, () -> new FizzBuzz().generate(0)).getMessage());
        assertEquals(FizzBuzz.NUMBER_MUST_GREATER_THAN_0, assertThrows(IllegalArgumentException.class, () -> new FizzBuzz().fizzBuzz(0)).getMessage());
    }

    @ParameterizedTest
    @MethodSource("addFizzBuzzOfTestData")
    void when_given_int_then_return_string(String excepted, int number) {
        assertThat(excepted).isEqualTo(new FizzBuzz().of(number));
    }


    @ParameterizedTest
    @MethodSource("addFizzBuzzGenerateTestData")
    void when_given_int_then_return_string_array(String[] excepted, int number) {
        assertThat(excepted).isEqualTo(new FizzBuzz().generate(number));
    }

    @ParameterizedTest
    @MethodSource("addFizzBuzzTestData")
    void test_fizz_buzz(List<String> excepted, int number) {
        assertThat(excepted).isEqualTo(new FizzBuzz().fizzBuzz(number));
    }


}
