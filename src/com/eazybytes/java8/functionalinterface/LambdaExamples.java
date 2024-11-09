package com.eazybytes.java8.functionalinterface;

public class LambdaExamples {
    public static void main(String[] args) {
        voidmethodsWithNoParams();
        System.out.println();
        voidMethodsWithOneParam();
        System.out.println();
        voidMethodWithTwoParam();
    }




    private static void voidmethodsWithNoParams() {
        /**
         *  Lambda expression with one Behaviour/method
         */
        VoidMethodsWithNoParam voidMethodsWithNoParams1 = () -> System.out.println("Method with no rewturn qand input param");

        /**
         *  Lambda expression with one Behaviour/method
         */

        VoidMethodsWithNoParam param2 = () -> System.out.println("Ignoring {} since we have only one line");

        voidMethodsWithNoParams1.printWishMessage();
        param2.printWishMessage();
    }


    private static void voidMethodsWithOneParam() {

        VoidMethodsWithOneParam method1 = (input -> {
            System.out.println(input);
        });

        VoidMethodsWithOneParam method2 = (input) -> System.out.println(input);

        method1.voidMethodsWithOneParam("Hello All EazyBytes Learner... Morning Batch Students");
        method2.voidMethodsWithOneParam("Hello All EazyBytes ...Evening Batch Students");
    }

    /**
     *  Lambda expression with two Behaviour/method,
     *
     *  First Addition : VoidMethodsWithTwoParam method1 = (input1, input2) -> System.out.println(input1+input2);
     *
     *  Second Multiplication : VoidMethodsWithTwoParam method2 = (param1,param2) -> System.out.println(param1 * param2);
     *
     *  So we can say that we can have multiple lambda expressions for one method with different behaviour.
     */

    private static void voidMethodWithTwoParam() {

        VoidMethodsWithTwoParam method1 = (input1, input2) -> {
            System.out.println("Addition :"+ input1+input2);
        };

        method1.voidMethodsWithTwoParam(10,20);


        VoidMethodsWithTwoParam method2 = (param1,param2) -> {
            System.out.println("Multiplication :"+ param1 * param2);
        };

        method2.voidMethodsWithTwoParam(10,20);
    }



}
