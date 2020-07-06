package com.learning.datastructures;

import java.util.Arrays;

public class MovingZeroesToBeginningOfTheArray {
    public static void main(String[] args) {
        int[] intArray = {0, 7, -1, 0, 100, 9, 7,2,101,3,0,8, 15,6,0,3,-5};
        int[] finalArray = moveZeroesToStart( intArray );
        Arrays.stream( finalArray ).forEach( System.out::println );
    }
    public static int[] moveZeroesToStart(int[] arr) {
        int pointer=arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            // Skip over zero elements
            //if the current element is not zero,copy the element to the pointer's index of the array
            //then decrement the pointer to move to next element
            if(arr[i]!=0) {
                arr[pointer--] = arr[i];
            }
        }

        //After filling all non-zero elements, fill the beginning spots with zeroes
        while(pointer >= 0){
            arr[pointer--] = 0;
        }

        return arr;
    }
}
