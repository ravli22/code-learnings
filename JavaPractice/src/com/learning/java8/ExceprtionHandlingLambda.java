package com.learning.java8;

import com.sun.javafx.image.IntPixelGetter;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ExceprtionHandlingLambda {
    public static void main(String[] args) {
        int[] numberArray = {1,2,3,4,5};
        int key = 0;
//        process(numberArray,key,(i,k)->{
//            try {
//                System.out.println(i / key);
//            } catch (ArithmeticException e) {
//                System.out.println("Arithmetic Exception caused");
//            }
//        });
        process(numberArray,key,wrapperLambda((i,k)->System.out.println(i/k)));
        }


    private static void process(int[] numberArray, int key, BiConsumer<Integer,Integer> consumer) {
        for (int i:numberArray) {
            consumer.accept(i,key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer) {
        return (v,k)->{
            try {
                consumer.accept(v, k);
            }catch (ArithmeticException e){
                System.out.println("Exception caused "+e);
            }
        };
    }
}
