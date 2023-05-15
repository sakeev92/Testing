package com.Testing.service.impl;

import com.Testing.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }
    @Override
    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }
    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }




    @Override
    public Double divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new  IllegalArgumentException();
        }
        return (double) num1 / num2;
    }


}
