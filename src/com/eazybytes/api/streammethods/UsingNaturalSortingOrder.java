package com.eazybytes.api.streammethods;


import java.util.stream.Stream;

public class UsingNaturalSortingOrder {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(5, 3, 1, 4, 2);

        // Use sorted() to sort the stream in natural order
        Stream<Integer> sortedStream = stream.sorted();

        //print the sorted stream
        sortedStream.forEach(System.out::println);
    }
}
