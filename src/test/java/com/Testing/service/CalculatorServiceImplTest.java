package com.Testing.service;

import com.Testing.service.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceImplTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void shouldCorrectlyCalculatePlus() {
        Integer num1 = 10;
        Integer num2 = 20;
        Integer expectedResult = num1 + num2;

        Assertions.assertEquals(expectedResult, calculatorService.plus(num1, num2));
    }
@Test
    public void shouldCorrectlyCalculateMinus() {
        Integer num1 = 10;
        Integer num2 = 20;
        Integer expectedResult = num1 - num2;

        Assertions.assertEquals(expectedResult, calculatorService.minus(num1, num2));
    }
    @Test
    public void shouldCorrectlyCalculateMultiply() {
        Integer num1 = 10;
        Integer num2 = 20;
        Integer expectedResult = num1 * num2;

        Assertions.assertEquals(expectedResult, calculatorService.multiply(num1, num2));
    }
    @Test
    public void shouldCorrectlyCalculateDivide() {
        Integer num1 = 20;
        Integer num2 = 2;
        Double expectedResult = 10.0;

        Assertions.assertEquals(expectedResult, calculatorService.divide(num1, num2));
    }

    @Test
    public void shouldTrowExceptionWhenSecondArgumentIsZero() {
        Integer num1 = 10;
        Integer num2 = 0;
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calculatorService.divide(num1, num2));
    }
}




