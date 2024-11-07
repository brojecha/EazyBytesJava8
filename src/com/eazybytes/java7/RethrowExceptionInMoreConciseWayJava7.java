package com.eazybytes.java7;

public class RethrowExceptionInMoreConciseWayJava7 {
    public static void main(String[] args) {
        /**
         *  As we arew using Java 17, few features are not supported from the below mention features.
         */

        //beforeJava7("first");
        //withJava7("first");
    }
}

/**
 *  Before Java 7 the code looks like this and we throw ofException Type.
 */

//private static void beforeJava7(String s) throws Exception {
//    try {
//        if(s.equals("first")) {
//            throw new FirstException();
//        }else {
//            throw new SecondException();
//        }
//    }catch (Exception e) {
//        throw e;
//    }
//}


/**
 *  With Java 7 the code looks like this and we throw of Exception Type.
 */

//private static void withJava7(String s) throws SecondException, FirstException {
//    try {
//        if(s.equals("first")) {
//            throw new FirstException();
//        }else {
//            throw new SecondException();
//        }
//    }catch (Exception e) {
//        throw e;
//    }
//}

class FirstException extends Exception {

}

class SecondException extends Exception {

}



