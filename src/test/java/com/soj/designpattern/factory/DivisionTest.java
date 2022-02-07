package com.soj.designpattern.factory;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void testToCalculateDivision() {
        Operator divide=new Division();
        double result=divide.calculate(9,3);
        Assertions.assertEquals(3,result);
    }
}