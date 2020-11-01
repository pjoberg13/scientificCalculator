package com.zipcodewilmington.scientificcalculator;

import  static java.lang.Math.*;

public class ScientificFunctions {


    //Display Mode Options below

    public String displayMode;

    public void switchDiplayMode(){
        if (displayMode.equals("binary")){
            displayMode = "decimal";
        } else if (displayMode.equals("decimal")){
            displayMode = "octal";
        } else if (displayMode.equals("octal")){
            displayMode = "hexadecimal";
        } else {
            displayMode = "binary";
        }
    }

    //Memory Storage will go below



    //Trigonometric Functions below
    public static float sine(float a){
        return (float) sin(a);
    }

    public static float cosine(float a){
        return (float) cos(a);
    }

    public static float tangent(float a){
        return (float) tan(a);
    }

    public  static float sineInverse(float a){
        return (float) asin(a);
    }

    public static float cosInverse(float a){
        return (float) acos(a);
    }

    public static float tanInverse(float a){
        return (float) atan(a);
    }

    //Switch Trig units options below (degrees, radians)
    public String unitsMode;
    public String switchUnitsMode;

    public void switchUnitsMode(){
        if (unitsMode.equals("degrees")){
            unitsMode = "radians";
        } else {
            unitsMode = "degrees";
        }
    }
    public void switchUnitsMode(String mode){
        unitsMode = mode;
    }

    //Logarithmic Expressions below

    public static float logarithm(float a){
        return (float) log10(a);
    }

    public static float inverseLog(float a){
        return (float) Math.pow(10, a);
    }

    public static float naturalLog(float a){
        return (float) Math.pow(10, a);
    }

    public static float inverseNaturalLog(float a){
        return (float) exp(a);
    }

    //Factorial Function below
    public static long factorial(int number){
        int sum = 1;
        for (int factor = 2; factor <= number; factor++){
            sum *= factor;
        }
        return sum;
    }
}
