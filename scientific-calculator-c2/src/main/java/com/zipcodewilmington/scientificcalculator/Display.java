package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

public class Display {
    private static Double memory;
    public static  Double numOnScreen = 0.0;
    public static Boolean ifMemory = false;

    //MEMORY

    //method to add to memory and update screen

    public static Double addMemory(Double numOnScreen) {

        if(ifMemory == false) {      //if memory is empty, store in memory and update display
            memory = numOnScreen;
            ifMemory = true;
            return numOnScreen;
        } else Console.println("Memory full. Please clear memory first.");
        return numOnScreen;
    }

   public static void getAddMemoryInput(){
        Double numOnScreen = Double.parseDouble(Console.getStringInput("enter value"));
        Console.println(String.valueOf(Display.addMemory(numOnScreen)));
        }



    //method to reset memory

    public static Double resetMemory() {
        if(ifMemory == true) {       //if memory is full, clear memory
            memory = 0.0;
            memory = numOnScreen;
            return numOnScreen;
        } else Console.println("Memory is clear");
        return numOnScreen;
    }

    public static void getResetMemoryInput(){
        Double numOnScreen = Double.parseDouble(String.valueOf(Display.resetMemory()));
        Console.println(String.valueOf((Display.resetMemory())));
    }


    //method to recall memory and display on the screen

    public static Double recallMemory() {
        memory = numOnScreen;
        return numOnScreen;
    }

    public static void getRecallMemoryInput(){
        Double numOnScreen = Double.parseDouble(String.valueOf(Display.recallMemory()));
        Console.println(String.valueOf(Display.recallMemory()));
    }

}
