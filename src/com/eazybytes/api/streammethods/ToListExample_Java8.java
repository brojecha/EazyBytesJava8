package com.eazybytes.api.streammethods;

import java.util.List;
import java.util.stream.Stream;

public class ToListExample_Java8 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8);

        // Use toList() to collect elements into a list
        List<Integer> list = stream.toList();

        // Print the elements of the list
        for(Integer val : list){
            System.out.print(val+" ");
        }

    }
}
