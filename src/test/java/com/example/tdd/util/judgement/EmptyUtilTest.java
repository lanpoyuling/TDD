package com.example.tdd.util.judgement;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class EmptyUtilTest implements BaseEmptyExperimentData {

    @ParameterizedTest
    @MethodSource("stringTestData")
    void test_string_is_empty(String actual, boolean expected) {
        AssertionsForClassTypes.assertThat(EmptyUtil.stringUtilsIsEmpty(actual)).isEqualTo(expected);
        assertThat(EmptyUtil.objectUtilsIsEmpty(actual)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("customStringTestData")
    void test_string_is_empty_custom(String actual, boolean expected) {
        assertThat(EmptyUtil.isEmpty(actual)).isEqualTo(expected);
        assertThat(EmptyUtil.isNotEmpty(actual)).isEqualTo(!expected);
    }

    @ParameterizedTest
    @MethodSource("stringContainsTestData")
    void test_string_contains_custom(String origin, String keywords, boolean expected) {
        assertThat(EmptyUtil.contains(origin, keywords)).isEqualTo(expected);
    }


    @ParameterizedTest
    @MethodSource("listTestData")
    void test_collection_is_empty(List<?> actual, boolean expected) {
        assertThat(EmptyUtil.collectionIsEmpty(actual)).isEqualTo(expected);
    }
}
