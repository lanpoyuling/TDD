package com.example.tdd;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static com.example.tdd.FizzBuzz.*;

/**
 * @ClassName AbstractFizzBuzzTest
 * @Description FizzBuzz 测试数据抽象类
 * @Author 10932
 * @Date 7/25/2021 10:46 AM
 **/
public class AbstractFizzBuzzTest {
    protected static final String[] argumentsWhenNumberIsOne = {"1"};
    protected static final String[] argumentsWhenNumberIsThree = {"1", "2", FIZZ};
    protected static final String[] argumentsWhenNumberIsFive = {"1", "2", FIZZ, "4", BUZZ};
    protected static final String[] argumentsWhenNumberIsFifteen = {"1", "2", FIZZ, "4", BUZZ, FIZZ, "7", "8", FIZZ, BUZZ, "11", FIZZ, "13", "14", FIZZ_BUZZ};


    protected static Stream<Arguments> addFizzBuzzOfTestData() {
        return Stream.of(
                Arguments.of("1", 1),
                Arguments.of(FIZZ, 3),
                Arguments.of(BUZZ, 5),
                Arguments.of(FIZZ_BUZZ, 15)
        );
    }

    protected static Stream<Arguments> addFizzBuzzGenerateTestData() {
        return Stream.of(
                Arguments.of(FizzBuzzTest.argumentsWhenNumberIsOne, 1),
                Arguments.of(FizzBuzzTest.argumentsWhenNumberIsThree, 3),
                Arguments.of(FizzBuzzTest.argumentsWhenNumberIsFive, 5),
                Arguments.of(FizzBuzzTest.argumentsWhenNumberIsFifteen, 15)
        );
    }

    protected static Stream<Arguments> addFizzBuzzTestData() {
        return Stream.of(
                Arguments.of(CollectTools.transferArrayToList(FizzBuzzTest.argumentsWhenNumberIsOne), 1),
                Arguments.of(CollectTools.transferArrayToList(FizzBuzzTest.argumentsWhenNumberIsThree), 3),
                Arguments.of(CollectTools.transferArrayToList(FizzBuzzTest.argumentsWhenNumberIsFive), 5),
                Arguments.of(CollectTools.transferArrayToList(FizzBuzzTest.argumentsWhenNumberIsFifteen), 15)
        );
    }
}
