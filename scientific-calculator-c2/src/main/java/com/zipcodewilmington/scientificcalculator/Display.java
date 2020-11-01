package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

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

        //Output
        System.out.println();
    }

}
