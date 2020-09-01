package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

public class MissingNumberInArrayOverflow {
    public static void main(String[] args) {
        int[] inputArray = ArrayUtils.getInputArray();
        System.out.println(findMissingNumber(inputArray,inputArray.length));
    }

    static int findMissingNumber(int[] arr,int n){

        //1. take 2 variables a, b
        int a = 1;
        int b = arr[0];
        //2. calculate XOR of all the numbers from 1 to N and store it in a
        for(int i=2;i<=n+1;i++){
            a = a^i;
        }
        //3. calculate XOR of all the numbers in the array and store it in b
        for(int i=1;i<arr.length;i++){
            b = b^arr[i];
        }
        //4. find the missing number by doing a^b( a XOR b)
        return a^b;
    }
}
