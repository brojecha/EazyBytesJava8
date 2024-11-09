package com.eazybytes.java8.functionalinterface;

/**
 *  Thumb rule: A functional interface can have only one abstract method.
 *
 *   A functional interface can have any number of static and default methods.
 *
 */
@FunctionalInterface
public interface VoidMethodsWithNoParam {
    /**
     *
     * @param  no parameter.
     */
    void printWishMessage();
}
