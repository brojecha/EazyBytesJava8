package com.eazybytes.java8.defaultmethods;

public class Honda implements Vehicle{
    @Override
    public int getSpeed() {
        return 100;
    }

    @Override
    public void applyBreak() {
        System.out.println("Apply Break when Speed changes to above 100");
    }

    /**
     *  Default methods in Java 8. This is a new feature in Java 8.
     *
     *  We have overridden the default method with our own implementation based on the business specific requirement.
     *
     *
     */

    @Override
    public void autoPilot(){
        System.out.println("I have Override the Auto Pilot which is a default method");
    }

    public static void main(String[] args) {
        //Creating the Honda class object to access the behaviour methods and default methods.
        Honda honda = new Honda();
        System.out.println("Speed of Honda is : "+honda.getSpeed());
        honda.applyBreak();
        honda.autoPilot();
    }
}
