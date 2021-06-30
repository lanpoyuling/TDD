package com.example.tdd;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

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
public class FizzBuzzTest {
    private static final String[] argumentsWhenNumberIsOne = {"1"};
    private static final String[] argumentsWhenNumberIsThree = {"1", "2", "Fizz"};
    private static final String[] argumentsWhenNumberIsFive = {"1", "2", "Fizz", "4", "Buzz"};
    private static final String[] argumentsWhenNumberIsFifteen = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};

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

    private static Stream<Arguments> addFizzBuzzOfTestData() {
        return Stream.of(
                Arguments.of("1", 1),
                Arguments.of("Fizz", 3),
                Arguments.of("Buzz", 5),
                Arguments.of("FizzBuzz", 15)
        );
    }

    private static Stream<Arguments> addFizzBuzzGenerateTestData() {

        return Stream.of(
                Arguments.of(argumentsWhenNumberIsOne, 1),
                Arguments.of(argumentsWhenNumberIsThree, 3),
                Arguments.of(argumentsWhenNumberIsFive, 5),
                Arguments.of(argumentsWhenNumberIsFifteen, 15)
        );
    }

    private static Stream<Arguments> addFizzBuzzTestData() {
        return Stream.of(
                Arguments.of(transferArrayToList(argumentsWhenNumberIsOne), 1),
                Arguments.of(transferArrayToList(argumentsWhenNumberIsThree), 3),
                Arguments.of(transferArrayToList(argumentsWhenNumberIsFive), 5),
                Arguments.of(transferArrayToList(argumentsWhenNumberIsFifteen), 15)
        );
    }

    private static List<String> transferArrayToList(String[] array) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, array);
        return strings;
    }
}
