package com.learning.datastructures.arrays;

import java.math.BigInteger;

public class FactorialOfLargeNumbers {
    public static void main(String[] args) {
        System.out.println(findFactorial(100000));
    }
    static BigInteger findFactorial(int x){
        BigInteger fact = BigInteger.ONE;
        for(int i=x; i>0;i--){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
