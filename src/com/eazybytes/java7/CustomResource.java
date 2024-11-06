package com.eazybytes.java7;

public class CustomResource implements AutoCloseable{

    /**
     *
     * @throws Exception : throws Exception.
     */
    @Override
    public void close() throws Exception {
        System.out.println("From close method inside Custom Resource Class");
    }

    public void readFromResource(){
        System.out.println("Reading from Data Source");
    }
}
