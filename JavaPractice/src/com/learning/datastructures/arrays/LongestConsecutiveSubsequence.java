package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

import java.util.Collections;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] inputArray = ArrayUtils.getInputArray();
        System.out.println(findSubsequenceLength(inputArray));
    }
    static int findSubsequenceLength(int[] arr){
        int count ;
        int max = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int firstElement = 0;
        for(int i=0;i<arr.length;i++){
            count = 1;
            if(!set.contains(arr[i]-1)){
                firstElement = arr[i];
                while(set.contains(firstElement+1)){
                    firstElement += 1;
                    count++;
                }
                if(max < count){
                    max = count;
                }
            }
        }
        return max;
    }

}
