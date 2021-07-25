package com.example.tdd.util.judgement;

import org.junit.jupiter.params.provider.Arguments;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @ClassName BaseEmptyExperimentData
 * @Description Empty-Contains试验数据
 * @Author 10932
 * @Date 7/25/2021 12:01 PM
 **/
public interface BaseEmptyExperimentData {
    static Stream<Arguments> stringContainsTestData() {
        return Stream.of(Arguments.of("220Kv", "kv", true),
                Arguments.of(" ", "kv", false),
                Arguments.of(null, "kv", false));
    }

    static Stream<Arguments> stringTestData() {
        return Stream.of(Arguments.of("", true),
                Arguments.of(" ", false),
                Arguments.of(" ".trim(), true),
                Arguments.of(null, true)
        );
    }

    static Stream<Arguments> listTestData() {
        return Stream.of(Arguments.of(new ArrayList<>(), true), Arguments.of(null, true));
    }

    static Stream<Arguments> customStringTestData() {
        return Stream.of(
                Arguments.of(null, true),
                Arguments.of("", true),
                Arguments.of(" ", true),
                Arguments.of("1", false)
        );
    }
}
