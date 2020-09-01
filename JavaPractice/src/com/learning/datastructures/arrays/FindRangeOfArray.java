package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

public class FindRangeOfArray {
    public static void main(String args[]){
        int[] array = ArrayUtils.getInputArray();
        //Find the minimum and max of the array and find the range by using (range = Max - min)  formula
        int range =findMax(array,array.length) - findMin(array,array.length) ;
        System.out.println("Range of the array :"+range);
    }
    static int findMin(int arr[], int size){
        int min = arr[0];
        for(int i = 1 ; i < size-1 ; i++){
            if(arr[i]< min){
                min = arr[i];
            }
        }
        return min;
    }
    static int findMax(int[] arr,int size){
        int max = arr[0];
        for(int i = 1 ; i < size-1 ; i++){
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
