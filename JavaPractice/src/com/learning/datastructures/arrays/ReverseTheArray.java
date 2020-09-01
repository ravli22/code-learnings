package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

public class ReverseTheArray {
    public static void main(String args[]){
        int[] arr = ArrayUtils.getInputArray();
        reverse(arr,arr.length);
        ArrayUtils.printArray(arr);


    }
    static void reverse(int[] arr,int size){
        int start = 0;
        int end = size-1;
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
