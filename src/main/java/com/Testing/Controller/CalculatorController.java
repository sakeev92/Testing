package com.Testing.Controller;

import com.Testing.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping("")
    public String hello() {
        return calculatorService.hello();
    }


    @GetMapping("plus")
    public int plus(@RequestParam(value="num1", required=false) Integer num1,
                    @RequestParam(value="num2", required=false) Integer num2) {

        return calculatorService.plus(num1, num2);
    }
    @GetMapping("minus")
    public Integer minus(@RequestParam(value="num1", required=false) Integer num1,
                         @RequestParam(value="num2", required=false) Integer num2) {

        return calculatorService.minus(num1, num2);
    }

    @GetMapping("multiply")
    public Integer multiply(@RequestParam(value="num1", required=false) Integer num1,
                           @RequestParam(value="num2", required=false) Integer num2) {

        return calculatorService.multiply(num1, num2);
    }
    @GetMapping("divide")
    public Double divide(@RequestParam(value="num1", required=false) Integer num1,
                        @RequestParam(value="num2", required=false) Integer num2) {

        return calculatorService.divide(num1, num2);
    }




}


