package com.learnjava.lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        // Prior to Java 8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();

        // Java 8 Lambda Syntax
        // ()->{}
        Runnable runnableLambda = ()->{
            System.out.println("Inside Runnable 2");
        };
        Runnable runnableLambda1 = ()->System.out.println("Inside Runnable Single Line 2");
        new Thread(runnableLambda1).start();

        // one line
        new Thread(()-> System.out.println("Inside Runnable Lambda 3")).start();
    }
}
