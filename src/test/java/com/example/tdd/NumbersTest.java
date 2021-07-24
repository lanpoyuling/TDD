package com.example.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;



class NumbersTest {
    @ParameterizedTest
    @ValueSource(ints = {1,3,5,-3,15,Integer.MAX_VALUE})
    void isOdd_ShouldReturnTrueForOddNumbers(int numbers) {
      boolean  flag=  Numbers.isOdd(numbers);
        Assertions.assertThat(flag).isTrue();
    }
}

