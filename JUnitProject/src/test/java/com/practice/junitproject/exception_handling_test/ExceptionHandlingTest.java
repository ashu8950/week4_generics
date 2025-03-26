package com.practice.junitproject.exception_handling_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.practice.junitproject.exception_handling.ExceptionHandling;

public class ExceptionHandlingTest {
    
    @Test
    void testDivide() {
        assertEquals(2, ExceptionHandling.divide(10, 5));
        assertEquals(3, ExceptionHandling.divide(9, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> ExceptionHandling.divide(10, 0));
    }
}
