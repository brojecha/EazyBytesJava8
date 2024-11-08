package com.eazybytes.java8.defaultmethods;

public interface Vehicle {

    public int getSpeed();

    public void applyBreak();

    /**
     *  so Interface can have default methods as well @Since Java 1.8.
     *
     *  And if we do not like the implementation of the default methods we can override in the implementation class
     */
    public default void autoPilot(){
        System.out.println("AutoPilot is on");
    }
}
