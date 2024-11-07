package com.eazybytes.java7;

import java.util.logging.Logger;

public class BinaryLiteralsJava7Feature {
    public static final Logger LOGGER = Logger.getLogger(BinaryLiteralsJava7Feature.class.getName());
    public static void main(String[] args) {


        byte byteBinary = 0b111;
        short shortBinary = 0b001;
        int intBinary = 0b101;
        long longBinary = 0b0001010111;

        LOGGER.info("The value of Byte number is : "+byteBinary);
        LOGGER.info("The value of Short number is : "+shortBinary);
        LOGGER.info("The value of Int number is : "+intBinary);
        LOGGER.info("The value of Long number is : "+longBinary);

    }
}
