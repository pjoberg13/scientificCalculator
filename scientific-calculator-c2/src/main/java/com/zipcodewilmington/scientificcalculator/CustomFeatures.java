package com.zipcodewilmington.scientificcalculator;

public class CustomFeatures {

    //calculate dog age in human years

    public static Double dogToHumanAge(Double dogAge) {
        double year1 = 15;
        double year2 = 9;
        double year3 = 5;

        try {
            if (dogAge <= 1 && dogAge > 0) {
                return year1;
            } else if (dogAge > 1 && dogAge <= 2) {
                return year1 + year2;
            } else {
                return year1 + year2 + (year3 * (dogAge - 2));
            }
        } catch (Exception e) {
            Console.println("Err");
        }
    }

    public static void getDogToHumanAgeInput() {
        Double dogAge = Console.getDoubleInput("enter your dog's age in years to calculate it's age in human years");
        Console.println(String.valueOf(CustomFeatures.dogToHumanAge(dogAge)));
    }

    public static Double catToHumanAge(Double catAge) {
        double year1 = 25;
        double year2 = 4;

        try {
            if (catAge <= 1 && catAge > 0) {
                return year1;
            } else if (catAge > 1 && catAge <= 2) {
                return year1 * 2;
            } else {
                return year1 * 2 + (year2 * (catAge - 2));
            }
        } catch (Exception e) {
            Console.println("Err");
        }
    }

    public static void getCatToHumanAgeInput() {
        Double catAge = Console.getDoubleInput("enter your cat's age in years to calculate it's age in human years");
        Console.println(String.valueOf(CustomFeatures.catToHumanAge(catAge)));
    }
}