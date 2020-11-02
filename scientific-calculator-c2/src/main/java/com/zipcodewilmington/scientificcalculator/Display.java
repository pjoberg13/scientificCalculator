package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
import java.lang.String;
public class Display {

    public static void main(String[] args){
        ScientificFunctions sci = new ScientificFunctions();
        sci.displayMode = "decimal";
        sci.unitsMode = "degrees";
        Scanner in = new Scanner(System.in);

        System.out.println("Choose between binary, decimal, hexadecimal, and octal");

        //User input
        String userInput = in.nextLine();

        if (in.equals("binary")){
            sci.displayMode = "binary";
        }else if (in.equals("decimal")) {
            sci.displayMode = "decimal";
        }else if (in.equals("hexadecimal")) {
            sci.displayMode = "hexadecimal";
        }else if (in.equals("octal")){
            sci.displayMode = "octal;";
        }

        String decimal = userInput;
        String binary;
        binary = Integer.toBinaryString(Integer.parseInt(decimal));

        String octal;
        octal = Integer.toOctalString(Integer.parseInt(decimal));

        String hexadecimal;
        hexadecimal = Integer.toOctalString(Integer.parseInt(decimal));

        //Output
        System.out.println();
    }

}
