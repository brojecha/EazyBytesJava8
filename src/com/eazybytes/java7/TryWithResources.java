package com.eazybytes.java7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) throws Exception {
        beforeJava7();
        withJava7();
        withCustomResourceInJava7();
    }

    /**
     *
     * @throws IOException
     */
    private static void beforeJava7() throws IOException {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("C:/eazyBytes.txt"));
            String dataRead = br.readLine();
            while (dataRead != null) {
                System.out.println(dataRead);
            }
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }

    /**
     *
     * @throws IOException
     *
     *  With Java 7 As a developer we do not have to close the resource.Java 7 provides a try with resources syntax.
     *
     *   A new interface Automatic Closeable is introduced in Java 7. [Autocloseable]
     *
     *   All resource reference variable must be final or effective final.So cant perform reassignment within try block.
     */
    private static void withJava7() throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("C:/eazyBytes.txt"))){
            String dataRead = br.readLine();
            while (dataRead != null) {
                System.out.println(dataRead);
            }
        }
    }

    /**
     *
     * @throws Exception
     *
     *  Well here in the example we are using custom resource class which implements AutoCloseable interface
     *  to close the resource.
     */
    private static void withCustomResourceInJava7() throws Exception {
        try(CustomResource cr = new CustomResource()){
            cr.readFromResource();
        }
    }

}
