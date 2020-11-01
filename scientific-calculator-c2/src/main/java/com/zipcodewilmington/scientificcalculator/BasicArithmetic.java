package com.zipcodewilmington.scientificcalculator;

public class BasicArithmetic {

    public static double addition(Double num1, Double num2) {
        return num1 + num2;
    }

    public static void getAdditionInputs() {
        Double plus1 = Console.getDoubleInput("enter the first number you would like to add");
        Double plus2 = Console.getDoubleInput("enter the second number you would like to add");
        Console.println(String.valueOf(BasicArithmetic.addition(plus1, plus2)));
    }

    public static Double subtraction(Double sub1, Double sub2) {
        return sub1 - sub2;
    }

    public static void getSubtractionInputs() {
        Double sub1 = Console.getDoubleInput("enter the number you would like to subtract from");
        Double sub2 = Console.getDoubleInput("enter the number you would like to subtract");
        Console.println(String.valueOf(BasicArithmetic.subtraction(sub1, sub2)));
    }

    public static Double multiplication(Double mult1, Double mult2) {
        return mult1 * mult2;
    }

    public static void getMultiplicationInputs() {
        Double mult1 = Console.getDoubleInput("enter the first number you would like to multiply");
        Double mult2 = Console.getDoubleInput("enter the second number you would like to multiply");
        Console.println(String.valueOf(BasicArithmetic.multiplication(mult1, mult2)));
    }

    public static Double division(Double numerator, Double denominator) {
        return numerator / denominator;
    }

    public static void getDivisionInputs() {
        Double numerator = Console.getDoubleInput("enter the numerator");
        Double denominator = Console.getDoubleInput("enter the denominator");
        Console.println(String.valueOf(BasicArithmetic.division(numerator, denominator)));
    }
}
