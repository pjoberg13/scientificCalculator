package com.zipcodewilmington.scientificcalculator;

import static com.zipcodewilmington.scientificcalculator.Console.*;

public class AdvArithmetic {

    // Calculate the square (x<sup>2</sup>) and square root (√x) of the number on the display *

    public static Double square(Double num){
        return num * num;
    }

    public static void getSquareInput() {
        Double num = getDoubleInput("enter the number you would like to square");
        println(String.valueOf(AdvArithmetic.square(num)));
    }

    public static Double sqrt(Double num) {
//        try {
//            return Math.sqrt(num);
//        } catch (Exception e) {
//            Console.println("Err");
//        }
        return Math.sqrt(num);
    }
    public static void getSqrtInput () {
        Double num = getDoubleInput("enter the number you would like to find the square root of");
        println(String.valueOf(AdvArithmetic.sqrt(num)));
    }

    // Calculate variable exponentiation (x<sup>y</sup>)

    public static Double pow (Double base, Double exponent){
        return Math.pow(base, exponent);
    }

    public static void getPowInput () {
        Double base = getDoubleInput("enter the number you would like to use as the base");
        Double exponent = getDoubleInput("enter the number you would like to use as the exponent");
        println(String.valueOf(pow(base, exponent)));
    }

// Calculate the inverse of the number on the display (1/x) *

    public static double inverseFunction(Double num) {
//        try {
//            return 1 / num;
//        } catch (Exception e) {
//            Console.println("Err");
//        }
        return 1 / num;
    }

    public static void getInverseFunctionInput () {
        Double num = getDoubleInput("enter the number you would like to find the inverse of");
        println(String.valueOf(inverseFunction(num)));
    }

    // Invert the sign of the number on the display (switch between positive and negative)

    public static void getPositiveAndNegativeInput() {
        Double num = getDoubleInput("enter the number you would like to change");
        println(String.valueOf(positiveAndNegative(num)));
    }

    public static double positiveAndNegative(Double num) {
        //while(num != 0)
//        try {
//            return -num;
//        } catch (Exception e) {
//            Console.println("Err");
//        }
        return -num;

    }
}
