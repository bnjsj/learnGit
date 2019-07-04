package com.bnjsj.lambdatest;

/**
 * Created by bnjsj on 2019/6/11.
 */
public class LambdaTest {
    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();

        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (int a, int b) -> a - b;
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };
        MathOperation division = (int a, int b) -> {
            return a / b;
        };

        //lambdaTest.operate(10,5,addition);
//        System.out.println("10+5="+lambdaTest.operate(10,5,addition));
//        System.out.println("10*5="+lambdaTest.operate(10,5,multiplication));
        System.out.println("10*5=" + operate(10, 5, multiplication));

        GetMessage getMessage = message -> System.out.println("hello " + message);

        getMessage.sayMessage("nong");


        System.out.println("(2) 10+5=" + addition.operation(10, 5));

    }

    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }


}
