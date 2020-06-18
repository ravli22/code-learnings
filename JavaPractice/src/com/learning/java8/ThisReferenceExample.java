package com.learning.java8;

import java.awt.*;

public class ThisReferenceExample {
    private void doProcess(int i, Process p){
        p.process(i);
    }
    public static void main(String[] args) {
        ThisReferenceExample tref = new ThisReferenceExample();
        tref.doProcess(5, new Process() {
            @Override
            public void process(int a) {
                System.out.println("Value of a is "+a);
                System.out.println(this);
            }

                    @Override
                    public String toString() {
                        return "This is an anonymous inner class";
                    }
                }

        );

        ThisReferenceExample tref2 = new ThisReferenceExample();
        //tref2.doProcess(20,p->System.out.println(this)); //this will not work
        //'this' reference in  a lambda does not point to the lambda. 'this' reference will not be modified by any lambda.
        //in the above case, this refers to a static context.as it behaves same as how it behaves outside of the lambda.


    }
}
