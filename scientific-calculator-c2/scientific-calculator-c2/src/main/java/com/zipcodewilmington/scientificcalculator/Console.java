package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;
import org.jline.*;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(String.valueOf(prompt));
        Integer userInput = Integer.valueOf(scanner.nextLine());
        return userInput;
    }

    public static Float getFloatInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(String.valueOf(prompt));
        Float userInput = Float.valueOf(scanner.nextLine());
        return userInput;
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(String.valueOf(prompt));
        Double userInput = Double.valueOf(scanner.nextLine());
        return userInput;
    }

}
