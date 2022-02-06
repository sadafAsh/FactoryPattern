package com.soj.designpattern.factory;

public class Calculation {
    public Operator getCalculation(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("add")) {
            return new Addition();
        }
        if (type.equalsIgnoreCase("subtract")) {
            return new Subtraction();
        }
        if (type.equalsIgnoreCase("multiply")) {
            return new Multiplication();
        }
        if (type.equalsIgnoreCase("divide")) {
            return new Division();
        }
        return null;
    }
}

