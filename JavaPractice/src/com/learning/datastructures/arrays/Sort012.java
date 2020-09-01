package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

public class Sort012 {
    public static void main(String args[]){
        int[] array = ArrayUtils.getInputArray();
        sort(array,array.length);
        ArrayUtils.printArray(array);

    }
    static void sort(int[] arr,int size){
        /**
         * Use Dutch National flag algorithm
         */
        //Initiate 3 indices,low,mid and high
        int low = 0;
        int mid = 0;
        int high = size-1;
        int temp;
        //while loop breaks if mid pointer is greater than high pointer
        while(mid<=high){
            //in the case of 0: swap the elem at low index with elem at mid index and increment mid and low pointers
            if(arr[mid]==0){
                temp=arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }
            //in the case of 1: increment mid pointer
            else if(arr[mid]==1){
                mid++;
            }
            //in the case of 2: swap the elem at high index with elem at mid index and decrement high pointer
            else if(arr[mid]==2){
                temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }
}
