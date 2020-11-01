package com.zipcodewilmington.scientificcalculator;

public class AdvArithmetic {

    // Calculate the square (x<sup>2</sup>) and square root (√x) of the number on the display *

    public static Double square(Double num){
        return num * num;
    }

    public static void getSquareInput() {
        Double num = Console.getDoubleInput("enter the number you would like to square");
        Console.println(String.valueOf(AdvArithmetic.square(num)));
    }

    public static Double sqrt(Double num) {
        try {
            return Math.sqrt(num);
        } catch (Exception e) {
            Console.println("Err");
        }
    }
        public static void getSqrtInput () {
            Double num = Console.getDoubleInput("enter the number you would like to find the square root of");
            Console.println(String.valueOf(AdvArithmetic.sqrt(num)));
        }

        // Calculate variable exponentiation (x<sup>y</sup>)

        public static Double pow (Double base, Double exponent){
            return Math.pow(base, exponent);
        }

        public static void getPowInput () {
            Double base = Console.getDoubleInput("enter the number you would like to use as the base");
            Double exponent = Console.getDoubleInput("enter the number you would like to use as the exponent");
        }

// Calculate the inverse of the number on the display (1/x) *

    public static inverseFunction(Double num) {
            try {
                return 1 / num;
            } catch (Exception e) {
                Console.println("Err");
            }
        }

        public static void getInverseFunctionInput () {
            Double num = Console.getDoubleInput("enter the number you would like to find the inverse of");
        }

        // Invert the sign of the number on the display (switch between positive and negative)

    public static positiveAndNegative(Double num) {
            //while(num != 0)
            try {
                return -num;
            } catch (Exception e) {
                Console.println("Err");
            }

            public static void getPositiveAndNegativeInput () {
                Double num = Console.getDoubleInput("enter the number you would like to change");
            }
        }
    }