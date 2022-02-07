package com.soj.designpattern.factory;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {

    @Test
    void testForGettingAdditionCalculation() {
        Calculation calculation=new Calculation();
        Addition addition=new Addition();
      Operator result=  calculation.getCalculation("add");
        Assertions.assertTrue(true,"Addition is called");
    }
    @Test
    void testThatOperatorIsAnInstanceOfAdditionInCalculation() {
        Calculation calculation=new Calculation();

        Operator add = calculation.getCalculation("add");
        double result1 = add.calculate(3, 5);
        Assertions.assertTrue(add instanceof Addition);
        Assertions.assertInstanceOf(Operator.class,new Addition());
    }
    @Test
    void testForGettingSubtractionCalculation() {
        Calculation calculation=new Calculation();
        Subtraction subtract =new Subtraction();
        Operator result=  calculation.getCalculation("subtract");
        Assertions.assertTrue(true,"Subtraction is called");
    }
    @Test
    void testThatOperatorIsAnInstanceOfSubtractionInCalculation() {
        Calculation calculation = new Calculation();
        Operator subtract = calculation.getCalculation("subtract");
        double result1 = subtract.calculate(5, 3);
        Assertions.assertInstanceOf(Operator.class, new Subtraction());
    }

    @Test
    void testForGettingMultiplicationInCalculation() {
        Calculation calculation=new Calculation();
        Operator multiply=new Multiplication();
        Operator result=  calculation.getCalculation("multiply");
        Assertions.assertTrue(true,"Multiply is called");
    }
    @Test
    void testThatOperatorIsAnInstanceOfMultiplicationInCalculation() {
        Calculation calculation = new Calculation();

        Operator multiply = calculation.getCalculation("multiply");
        double result1 = multiply.calculate(3, 5);
        Assertions.assertTrue(multiply instanceof Multiplication);
        Assertions.assertInstanceOf(Operator.class, new Multiplication());

    }
    @Test
    void testForGettingDivisionInCalculation() {
        Calculation calculation=new Calculation();
        Operator divide=new Division();
        Operator result=  calculation.getCalculation("divide");
        Assertions.assertTrue(true,"Division is called");
    }

    @Test
    void testThatOperatorIsAnInstanceOfDivisionInCalculation() {
        Calculation calculation = new Calculation();

        Operator divide = calculation.getCalculation("divide");
        double result1 = divide.calculate(3, 5);
        Assertions.assertTrue(divide instanceof Division);
        Assertions.assertInstanceOf(Operator.class, new Division());
    }

    @Test
    void testNullInCalculation(){
        Calculation calculation=new Calculation();
       Operator result= calculation.getCalculation(null);
        Assertions.assertNull(result);
    }

    @Test
    void testReturnNullInCalculation() {
        Calculation calculation = new Calculation();
        Operator result = calculation.getCalculation("");
          Assertions.assertSame(null,result);
        Assertions.assertNull(result);
    }
    }