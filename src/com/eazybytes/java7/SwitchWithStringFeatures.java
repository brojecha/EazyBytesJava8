package com.eazybytes.java7;

public class SwitchWithStringFeatures {
    public static void main(String[] args) {
        displayTodayDetails();
        displayWeekDetails();
    }

    /**
     * Way to write a switch statement with string. Switch statement with string added features in Java 7
     */
    private static void displayWeekDetails() {
        String input = "Monday";
        switch(input){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }
    }

    /**
     *  Added features to switch statement in Java 7. This is a traditional way of writing switch statement.
     */
    private static void displayTodayDetails() {
        String input = "Monday";
        switch (input) {
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            default:
                System.out.println("Today is Saturday");
                break;
        }
    }
}
