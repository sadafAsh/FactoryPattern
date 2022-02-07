package com.soj.designpattern.factory;

import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {

    @Test
    void testToCalculateSubtraction() {
        Operator subtract=new Subtraction();
        double result=subtract.calculate(4.4,1.2);
        Assertions.assertEquals(3.2,result);
    }
}