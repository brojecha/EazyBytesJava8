package com.eazybytes.api.streammethods;

import java.util.stream.Stream;

/**
 *  This method is useful when you need to convert a stream back into an array for further processing or manipulation.
 *
 *  The toArray() method collects all elements of the stream into an array. The basic form returns an array of Object,
 */
public class ToArrayMethodsExample_Java8 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("apple", "banana", "cherry", "date");

        // Use toArray() to convert the stream to an array

        /**
         * The toArray() method is a terminal operation that collects the elements of a stream into an array. This method comes in
         * two overloaded forms: one that returns an Object array and
         * another that allows you to specify the type of array to be returned.
         */
        Object[] array = stream.toArray();

        // Print the elements of the array
        for (Object element : array) {
            System.out.println(element);
        }
    }
}
