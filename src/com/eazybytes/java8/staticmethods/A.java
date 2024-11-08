package com.eazybytes.java8.staticmethods;

public interface A {
    /**
     * @Since Java 1.8
     *
     * Static methods has introduced in Java 1.8.
     *
     * We can call the static methods which present inside interface by using Interface name A.
     *
     *  A.sayHello()
     */
    public static void sayHello() {
        System.out.println("Hello, This is a static methods inside an interface");
    }
}
