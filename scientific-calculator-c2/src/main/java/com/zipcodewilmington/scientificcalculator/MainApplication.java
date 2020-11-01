package com.zipcodewilmington.scientificcalculator;

import static com.zipcodewilmington.scientificcalculator.ScientificFunctions.*;
import static com.zipcodewilmington.scientificcalculator.CustomFeatures.*;


/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        Console.println("Welcome to our calculator!");

        // Integer i = Console.getIntegerInput("basic arithmetic: 1\nscientific operations: 2\ncustom features: 3");

        String quitOrNo = "";
        do {
            Integer i = Console.getIntegerInput("basic arithmetic/functions: 1\nscientific operations: 2\ncustom features: 3");
            switch (i) {
                case 1:
                Integer j = Console.getIntegerInput("addition: 1\nsubtraction: 2\nmultiplication: 3\ndivision: 4\n" +
                        "x^2: 5\nsquare root: 6\nx^n: 7\nget inverse: 8\nget positive and negative of input: 9");
                switch (j) {
                    case 1:
                        // call function to do math
                        BasicArithmetic.getAdditionInputs();
                        break;
                        // call function to display
                        // "Display.display();"
                    case 2:
                        BasicArithmetic.getSubtractionInputs();
                        break;
                    case 3:
                        BasicArithmetic.getMultiplicationInputs();
                        break;
                    case 4:
                        BasicArithmetic.getDivisionInputs();
                        break;
                    case 5:
                        AdvArithmetic.getSquareInput();
                        break;
                    case 6:
                        AdvArithmetic.getSqrtInput();
                        break;
                    case 7:
                        AdvArithmetic.getPowInput();
                        break;
                    case 8:
                        AdvArithmetic.getInverseFunctionInput();
                        break;
                    case 9:
                        AdvArithmetic.getPositiveAndNegativeInput();
                        break;
                    default:
                        Console.println("invalid input please try again.");
                        break;
                    }
                break;
                case 2:
                // Console.println("Still working on that!");
                Console.println("Which operation would you like to perform?");
                Integer scientificOperationMenu = Console.getIntegerInput("sine: 1\ncosine: 2\ntangent: 3\nsine inverse: 4\n" +
                        "cosine inverse: 5\ntangent inverse: 6\nlogarithm: 7\ninverse logarithm: 8\nnatural logarithm 9\n" +
                        "inverse natural logarithm: 10\nfactorial: 11");
                float input = 0;
                    switch (scientificOperationMenu) {
                        case 1:
                            // sine
                            input = Console.getFloatInput("enter the number you'd like to take the sine of:");
                            Console.println(String.valueOf(sine(input)));
                            break;
                        case 2:
                            // cosine
                            input = Console.getFloatInput("enter the number you'd like to take the cosine of:");
                            Console.println(String.valueOf(cosine(input)));
                            break;
                        case 3:
                            // tangent
                            input = Console.getFloatInput("enter the number you'd like to take the tangent of:");
                            Console.println(String.valueOf(tangent(input)));
                            break;
                        case 4:
                            // sine inverse
                            input = Console.getFloatInput("enter the number you'd like to take the inverse sine of:");
                            Console.println(String.valueOf(sineInverse(input)));
                            break;
                        case 5:
                            // cos inverse
                            input = Console.getFloatInput("enter the number you'd like to take the inverse cosine of:");
                            Console.println(String.valueOf(cosInverse(input)));
                            break;
                        case 6:
                            // tan inverse
                            input = Console.getFloatInput("enter the number you'd like to take the inverse tangent of:");
                            Console.println(String.valueOf(tanInverse(input)));
                            break;
                        case 7:
                            // logarithm
                            input = Console.getFloatInput("enter the number you'd like the log of:");
                            Console.println(String.valueOf(logarithm(input)));
                            break;
                        case 8:
                            // inverse log
                            input = Console.getFloatInput("enter the number you'd like the inverse log of:");
                            Console.println(String.valueOf(inverseLog(input)));
                            break;
                        case 9:
                            // natural log
                            input = Console.getFloatInput("enter the number you'd like the natural log of:");
                            Console.println(String.valueOf(naturalLog(input)));
                            break;
                        case 10:
                            // inverse natural log
                            input = Console.getFloatInput("enter the number you'd like the inverse natural log of:");
                            Console.println(String.valueOf(inverseNaturalLog(input)));
                            break;
                        case 11:
                            // factorial
                            input = Console.getIntegerInput("enter the number you'd like the factorial of:");
                            Console.println(String.valueOf(factorial(input)));
                            break;
                        default:
                        // error message repeat prompt
                            Console.println("invalid input please try again.");
                            break;
                    }
                    break;
                case 3:
                // Console.println("Still working on that!");
                Console.println("Which special function would you like to perform?");
                Integer customFeatureMenu = Console.getIntegerInput("your dog's age in human years: 1\nyour cat's age in human years: 2");

                switch (customFeatureMenu) {
                    case 1:
                        getDogToHumanAgeInput();
                        break;
                    case 2:
                        getCatToHumanAgeInput();
                        break;
                    default:
                        Console.println("invalid command please try again.");
                }
                break;
                default:
                Console.println("Invalid command, try that again");
                break;
            }


            quitOrNo = Console.getStringInput("Perform another calculation? Y/N");


        } while(quitOrNo.equals("Y"));
    }
}
