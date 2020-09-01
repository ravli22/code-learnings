package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

import java.util.HashSet;

public class ZeroSumSubarray {
    public static void main(String[] args) {
        int[] inputArray = ArrayUtils.getInputArray();
        System.out.println(subarrayExists(inputArray));
    }
    static boolean subarrayExists(int[] arr){
        int sum=0;
        HashSet<Integer> setOfSumValues = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(arr[i]==0 || sum==0 || setOfSumValues.contains(sum)){
                return true;
            }else{
                setOfSumValues.add(sum);
            }
        }
        return false;
    }
}
