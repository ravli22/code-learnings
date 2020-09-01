package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

public class MoveNegElementsToOneSide {
    public static void main(String[] args) {
        int[] inputArray = ArrayUtils.getInputArray();
        moveNegativeElementsToOneSide(inputArray,inputArray.length);
        ArrayUtils.printArray(inputArray);
    }
    static void moveNegativeElementsToOneSide(int[] arr,int size){
        int low = 0;
        int high = size-1;
        int temp;
        while(low <= high){
            if(arr[low]<0){
                low++;
            }
            else if(arr[low] >= 0){
                if(arr[high] < 0 ){
                    temp = arr[low];
                    arr[low] = arr[high];
                    arr[high] = temp;
                    low++;
                    high--;
                }else{
                    high--;
                }
            }
        }
    }
}
