package com.zipcodewilmington.scientificcalculator;

public class BasicArithmetic {

    public static Double addition(Double num1, Double num2) {
        return num1 + num2;
    }

    public static void getAdditionInputs() {
        Double plus1 = Console.getDoubleInput("enter the first number you would like to add");
        Double plus2 = Console.getDoubleInput("enter the second number you would like to add");
        Console.println(String.valueOf(BasicArithmetic.addition(plus1, plus2)));
    }

    public static Integer subtraction(Integer sub1, Integer sub2) {
        return sub1 - sub2;
    }

    public static void getSubtractionInputs() {
        Integer sub1 = Console.getIntegerInput("enter the number you would like to subtract from");
        Integer sub2 = Console.getIntegerInput("enter the number you would like to subtract");
        Console.println(String.valueOf(BasicArithmetic.subtraction(sub1, sub2)));
    }

    public static Integer multiplication(Integer mult1, Integer mult2) {
        return mult1 * mult2;
    }

    public static void getMultiplicationInputs() {
        Integer mult1 = Console.getIntegerInput("enter the first number you would like to multiply");
        Integer mult2 = Console.getIntegerInput("enter the second number you would like to multiply");
        Console.println(String.valueOf(BasicArithmetic.multiplication(mult1, mult2)));
    }

    public static Integer division(Integer numerator, Integer denominator) {
        return numerator / denominator;
    }

    public static void getDivisionInputs() {
        Integer numerator = Console.getIntegerInput("enter the numerator");
        Integer denominator = Console.getIntegerInput("enter the denominator");
        Console.println(String.valueOf(BasicArithmetic.division(numerator, denominator)));
    }
}
