package com.soj.designpattern.factory;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;

public class Main {
    static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {


        Calculation calculation = new Calculation();
        Operator add = calculation.getCalculation("add");
        double result1 = add.calculate(3, 5);
        logger.info("Calculation for addition");
        logger.log(Level.DEBUG, "The result for addition is {}", result1);

        logger.info("...............................................................");

        Operator subtract = calculation.getCalculation("subtract");
        double result2 = subtract.calculate(9.4, 3.2);
        logger.info("Calculation for subtraction");
        logger.log(Level.DEBUG, "The result for subtraction value is {}", result2);


        logger.info("/~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/");

        Operator multiply = calculation.getCalculation("multiply");
        double result3 = multiply.calculate(9.2, 9);
        logger.info("Calculation for multiply");
        logger.log(Level.DEBUG, "The result for multiplication is {}", result3);


        logger.info("/............................................................../");

        Operator divide = calculation.getCalculation("divide");
        double result4 = divide.calculate(9.18, 9);
        logger.info("Calculation for division");
        logger.log(Level.DEBUG, "The result for division is {}", result4);


    }
}
