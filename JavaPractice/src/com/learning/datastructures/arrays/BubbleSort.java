package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

public class BubbleSort {
    public static void main(String args[]){
        int[] arr = ArrayUtils.getInputArray();
        sort(arr,arr.length);
        ArrayUtils.printArray(arr);
    }
    public static void sort(int[] arr,int size){
        boolean swapped;
        int temp;
        for(int i = 0;i < size-1; i++){
            swapped=false;
            for(int j=0;j<size-i-1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
}

