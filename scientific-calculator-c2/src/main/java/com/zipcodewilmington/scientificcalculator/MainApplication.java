package com.zipcodewilmington.scientificcalculator;

import static com.zipcodewilmington.scientificcalculator.ScientificFunctions.*;


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
            Console.println("i = " + i);
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
                // Console.println("Still working on that!");
                Console.println("Which operation would you like to perform?");
                Integer scientificOperationMenu = Console.getIntegerInput("sine: 1\ncosine: 2\ntangent: 3\nsine inverse: 4\n" +
                        "cosine inverse: 5\ntangent inverse: 6\nlogarithm: 7\ninverse logarithm: 8\nnatural logarithm 9\n" +
                        "inverse natural logarithm: 10\nfactorial: 11");
                    if (scientificOperationMenu == 1) {
                        // sine
                        float input = Console.getFloatInput("enter the number you'd like to take the sine of:");
                        Console.println(String.valueOf(sine(input)));
                    } else if ( scientificOperationMenu == 2) {
                        // cosine
                        float input = Console.getFloatInput("enter the number you'd like to take the cosine of:");
                        Console.println(String.valueOf(cosine(input)));
                    } else if ( scientificOperationMenu == 3) {
                        // tangent
                        float input = Console.getFloatInput("enter the number you'd like to take the tangent of:");
                        Console.println(String.valueOf(tangent(input)));
                    } else if (scientificOperationMenu == 4) {
                        // sine inverse
                        float input = Console.getFloatInput("enter the number you'd like to take the inverse sine of:");
                        Console.println(String.valueOf(sineInverse(input)));
                    } else if (scientificOperationMenu == 5) {
                        // cos inverse
                        float input = Console.getFloatInput("enter the number you'd like to take the inverse cosine of:");
                        Console.println(String.valueOf(cosInverse(input)));
                    } else if (scientificOperationMenu == 6) {
                        // tan inverse
                        float input = Console.getFloatInput("enter the number you'd like to take the inverse tangent of:");
                        Console.println(String.valueOf(tanInverse(input)));
                    } else if (scientificOperationMenu == 7) {
                        // logarithm
                        float input = Console.getFloatInput("enter the number you'd like the log of:");
                        Console.println(String.valueOf(logarithm(input)));
                    } else if (scientificOperationMenu == 8) {
                        // inverse log
                        float input = Console.getFloatInput("enter the number you'd like the inverse log of:");
                        Console.println(String.valueOf(inverseLog(input)));
                    } else if (scientificOperationMenu == 9) {
                        // natural log
                        float input = Console.getFloatInput("enter the number you'd like the natural log of:");
                        Console.println(String.valueOf(naturalLog(input)));
                    } else if (scientificOperationMenu == 10) {
                        // inverse natural log
                        float input = Console.getFloatInput("enter the number you'd like the inverse natural log of:");
                        Console.println(String.valueOf(inverseNaturalLog(input)));
                    } else if (scientificOperationMenu == 11) {
                        // factorial
                        int input = Console.getIntegerInput("enter the number you'd like the factorial of:");
                        Console.println(String.valueOf(factorial(input)));
                    } else {
                        // error message repeat prompt
                    }
            } else if (i == 3) {
                // Console.println("Still working on that!");
                Console.println("Which special function would you like to perform?");
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
