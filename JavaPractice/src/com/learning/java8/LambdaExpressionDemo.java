package com.learning.java8;

public class LambdaExpressionDemo {

    public void greet(Greeting greeting){
        greeting.perform();
    }
    public static void main(String[] args) {
        LambdaExpressionDemo ld = new LambdaExpressionDemo();
        Greeting hw = new HelloWorldGreeting();
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hey!");
            }
        };

        Greeting myLambdaGreeting = ()-> System.out.println("Hi Everyone!");

        ld.greet(hw);
        ld.greet(innerClassGreeting);
        ld.greet(myLambdaGreeting);
        ld.greet(()-> System.out.println("Hi Everyone!"));
    }
}

interface  MyLambda {
    void foo();
}


class HelloWorldGreeting implements  Greeting {


    @Override
    public void perform() {
        System.out.println("Hello World!");
    }
}

@FunctionalInterface
interface Greeting {

    void perform();
}