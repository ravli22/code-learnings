package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

import java.util.Collections;
import java.util.HashSet;

public class LargestSumOfContiguousSubArray {
    public static void main(String[] args) {
        int[] inputArray = ArrayUtils.getInputArray();
        System.out.println(findLargestSum(inputArray));
    }
    static int findLargestSum(int[] arr){
        int sum=0;
        HashSet<Integer> sumValues = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(!sumValues.contains(sum)){
                sumValues.add(sum);
            }
        }
        return Collections.max(sumValues);
    }
}
