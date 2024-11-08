package com.eazybytes.java8.staticmethods;

public class B implements A{
    /**
     *  We can declare static methods for Utility functionality.
     *
     *  @Since Java 1.8
     */
    public static void sayHello(){
        System.out.println("This isa static method inside a class");
    }

    public static void main(String[] args) {
        B b = new B();
        b.sayHello();
        B.sayHello();
        A.sayHello();
    }
}
