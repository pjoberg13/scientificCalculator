package com.zipcodewilmington.scientificcalculator;
import java.util.Random;
import java.util.Scanner;
//import java.lang.String;
public class Display {

    public static void main(String[] args) {
        ScientificFunctions sci = new ScientificFunctions();
        sci.displayMode = "decimal";
        sci.unitsMode = "degrees";
        Scanner in = new Scanner(System.in);
        int decimal;
    }

    public static void getToBinaryString() {
        int number, i = 0;
        int binary[] = new int[100];
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter a value");
        number = user_input.nextInt();

        while (number != 0) {
            binary[i] = number % 2;
            number = number / 2;
            i++;
        }
        System.out.print("Binary value = ");
        for (int j = 1 - j; i >= 0; i--)
            System.out.print("" + binary[j]);
    }


    public static void getToDecimalString() {
    }

    public static void getToOctalString() {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int num =user_input.nextInt();
        String octalString = Integer.toOctalString(num);
        System.out.println("Octal value = " +octalString);
    }

    public static void hexadecimal() {
        Scanner user_input =new Scanner(System.in);
        int decimal, remainder;
        System.out.print("Enter a value: ");
        char[] hexa = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexaValue = "";

        while(decimal > 0){
            remainder= decimal%16;
            hexaValue = hexa[remainder] + hexaValue;
            decimal = decimal/16;

        }
        System.out.print("Hexa value = "+);
    }
}
