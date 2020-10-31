package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        Console.println("Welcome to our calculator!");

        // Integer i = Console.getIntegerInput("basic arithmetic: 1\nscientific operations: 2\ncustom features: 3");

        String quitOrNo = "";
        do {
            Integer i = Console.getIntegerInput("basic arithmetic: 1\nscientific operations: 2\ncustom features: 3");

            if (i == 1) {
                Integer j = Console.getIntegerInput("addition: 1\nsubtraction: 2\nmultiplication: 3\ndivision: 4");
                if (j == 1) {
                    BasicArithmetic.getAdditionInputs();
//                    Integer plus1 = Console.getIntegerInput("enter the first number you would like to add");
//                    Integer plus2 = Console.getIntegerInput("enter the second number you would like to add");
//                    Console.println(String.valueOf(BasicArithmetic.addition(plus1, plus2)));
                } else if (j == 2) {
                    BasicArithmetic.getSubtractionInputs();
//                    Integer sub1 = Console.getIntegerInput("enter the number you would like to subtract from");
//                    Integer sub2 = Console.getIntegerInput("enter the number you would like to subtract");
//                    Console.println(String.valueOf(BasicArithmetic.subtraction(sub1, sub2)));
                } else if (j == 3) {
                    BasicArithmetic.getMultiplicationInputs();
//                    Integer mult1 = Console.getIntegerInput("enter the first number you would like to multiply");
//                    Integer mult2 = Console.getIntegerInput("enter the second number you would like to multiply");
//                    Console.println(String.valueOf(BasicArithmetic.multiplication(mult1, mult2)));
                } else if (j == 4) {
                    BasicArithmetic.getDivisionInputs();
//                    Integer numerator = Console.getIntegerInput("enter the numerator");
//                    Integer denominator = Console.getIntegerInput("enter the denominator");
//                    Console.println(String.valueOf(BasicArithmetic.division(numerator, denominator)));
                }
            } else if (i == 2) {
                Console.println("Still working on that!");
            } else if (i == 3) {
                Console.println("Still working on that!");
            } else if (i >= 4) {
                Console.println("Invalid command, try that again");
            }

            quitOrNo = Console.getStringInput("Perform another calculation? Y/N");

        } while(quitOrNo.equals("Y"));

//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);
    }
}
