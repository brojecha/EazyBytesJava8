package com.eazybytes.java8.functionalinterface;

public class NumericCalculationImplementation {
    public static void main(String[] args) {
       CalculateAddition();
       System.out.println();
       CalculateMultiplication();
    }


    private static void CalculateAddition() {
        NumericCalculation method1 = (a, b) -> {
            System.out.println("Addition :"+ (a+b));
        };
        method1.calculate(10,20);
    }

    private static void CalculateMultiplication() {
        NumericCalculation method2 = (a, b) -> {
            System.out.println("Multiplication :"+ (a*b));
        };
        method2.calculate(10,20);
    }

}
