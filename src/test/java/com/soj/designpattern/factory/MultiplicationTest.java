package com.soj.designpattern.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    @Test
    void calculate() {
        Operator multiply=new Multiplication();
        double result=multiply.calculate(4,9);
        Assertions.assertEquals(36,result);
    }
}