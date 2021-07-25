package com.example.tdd;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class EmptyUtilTest {


    public static Stream<Arguments> stringTestData() {
        return Stream.of(Arguments.of("", true),
                Arguments.of(" ",false),
                Arguments.of(" ".trim(),true),
                Arguments.of(null,true));
    }

    public static Stream<Arguments> listTestData() {
        return Stream.of(Arguments.of(new ArrayList<>(),true),Arguments.of(null,true));
    }

    @ParameterizedTest
    @MethodSource("stringTestData")
    void test_string_is_empty(String actual, boolean expected) {
        assertThat(EmptyUtil.stringUtilsIsEmpty(actual)).isEqualTo(expected);
        assertThat(EmptyUtil.objectUtilsIsEmpty(actual)).isEqualTo(expected);
    }


    @ParameterizedTest
    @MethodSource("listTestData")
    void test_collection_is_empty(List<?> actual, boolean expected){
        assertThat(EmptyUtil.collectionIsEmpty(actual)).isEqualTo(expected);
    }
}
