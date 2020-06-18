package com.learning.java8;

public class ClosuresDemo {
    public static void main(String[] args) {
        int v = 18;
        int k = 20; //this is effectively final. We did not declare the variable as final
        // but the lambda which is using this will treat this as a final value
        //and it complains if we try to change the value
        doProcess(v,i->System.out.println(i+k));
    }

    private static void doProcess(int i,Process p) {
        p.process(i);
    }


}  interface Process {
    void process(int a);
}
