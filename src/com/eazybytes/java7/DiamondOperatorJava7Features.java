package com.eazybytes.java7;

import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.Map;

public class DiamondOperatorJava7Features {
    public static void main(String[] args) {
        beforeJava7();
        afterJava7();
    }

    /**
     *  Before Java 7 we have to create object with Generic Type on both side of Expression as Diamond Operator.
     */
    private  static void beforeJava7(){
        Map<String,Integer> inputMap = new HashMap<String,Integer>();
        inputMap.put("Monday",1);
        inputMap.put("Tuesday",2);
        inputMap.put("Wednesday",3);
        inputMap.put("Thursday",4);
        inputMap.put("Friday",5);
        inputMap.put("Saturday",6);
        inputMap.put("Sunday",7);

        for(Map.Entry<String,Integer> entry : inputMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("===========================================");
    }

    /**
     *  After Java 7 , Java provides a improved compiler which is smart enough to infer the type of Generic Instance.
     */

    private  static void afterJava7(){
        System.out.println();
        Map<String,Integer> inputMap = Map.of("Monday",1,"Tuesday",2,"Wednesday",3,"Thursday",4,"Friday",5,"Saturday",6,"Sunday",7);
        for(Map.Entry<String,Integer> entry : inputMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
