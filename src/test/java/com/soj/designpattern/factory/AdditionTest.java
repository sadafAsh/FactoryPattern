package com.soj.designpattern.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @Test
    void testToCalculateAddition() {
        Operator add=new Addition();
       double result= add.calculate(4,9);
        Assertions.assertEquals(13,result);
    }
}