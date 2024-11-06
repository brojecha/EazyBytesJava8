package com.eazybytes.java7;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CatchingMultipleExceptionFeature {
    public static final Logger LOGGER = Logger.getLogger(CatchingMultipleExceptionFeature.class.getName());

    public static void main(String[] args) {
        beforeJava7Implementation();
        withJava7Implementation();
    }


    private static void beforeJava7Implementation() {
        int[] array = {1,2,3};
        System.out.println("Printing Array Length : "+array.length);
        System.out.println();
        System.out.println("Printing Array Length by adding +1 : "+array.length+1);
        try{
            for(int i = 0;i<array.length+1;i++){
                System.out.println(array[i]);
            }
        }catch (NullPointerException e){
            LOGGER.log(Level.SEVERE,"Null Pointer Exception",e.toString());
        }catch (ArrayIndexOutOfBoundsException e){
            LOGGER.log(Level.SEVERE,"ArrayIndexOutOfBounds Exception",e.toString());
        }
    }


    private static void withJava7Implementation() {
        int[] array = {1, 2, 3};
        System.out.println("Printing Array Length : " + array.length);
        System.out.println();
        System.out.println("Printing Array Length by adding +1 : " + array.length + 1);
        try {
            for (int i = 0; i < array.length + 1; i++) {
                System.out.println(array[i]);
            }
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            LOGGER.log(Level.SEVERE, "Null Pointer Exception or ArrayIndexOutOfBounds Exception", e.toString());
        }
    }
}
