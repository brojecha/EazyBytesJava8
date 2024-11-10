package com.eazybytes.api.streammethods;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedWithComparatorExample {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("apple", "banana", "cherry", "date");

        // Use sorted() with a custom comparator to sort the elements by length
        Stream<String> sortedStream = stream.sorted(Comparator.comparingInt(String::length));

        //print the elements of the sorted stream based on length
        sortedStream.forEach(System.out::println);
    }
}
