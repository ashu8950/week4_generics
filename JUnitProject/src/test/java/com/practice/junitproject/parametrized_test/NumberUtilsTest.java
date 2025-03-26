package com.practice.junitproject.parametrized_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.practice.junitproject.testing_parametrized.NumberUtils;



public class NumberUtilsTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10}) // All should return true
    void testIsEvenWithEvenNumbers(int number) {
        assertEquals(true, NumberUtils.isEven(number), number + " should be even");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9}) // All should return false
    void testIsEvenWithOddNumbers(int number) {
        assertEquals(false, NumberUtils.isEven(number), number + " should be odd");
    }
}

