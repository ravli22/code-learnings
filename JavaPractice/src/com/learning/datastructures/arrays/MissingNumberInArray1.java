package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

public class MissingNumberInArray1 {
    public static void main(String[] args) {
        int[] inputArray = ArrayUtils.getInputArray();
        System.out.println(findMissingNumber(inputArray,inputArray.length));

    }
    static int findMissingNumber(int[] arr,int n){
        int sum = 0;
        int expectedSum = (n+1)*(n+2)/2;//here Range N will become n+1 i.e., size of the array+1
        for(int i=0 ; i<n;i++ ){//iterate over 1 to N
            sum += arr[i];
        }
        return expectedSum-sum;
    }
}
