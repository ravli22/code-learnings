package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

public class FindLargestThreeElementsInArray {
    public static void main(String[] args) {
        int[] inputArray = ArrayUtils.getInputArray();
        findLargestThreeElements(inputArray);
    }
    static void findLargestThreeElements(int[] arr){
        int first,second,third;

        if(arr.length<3){
            System.out.println("Invalid input");
        }else {
            first = second = third = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > first) {
                    third = second;
                    second = first;
                    first = arr[i];
                } else if (arr[i] > second) {
                    second = arr[i];
                } else if (arr[i] > third) {
                    third = arr[i];
                }
            }
            System.out.println("The Largest three elements : "+first+" ,"+second+" ,"+third);
        }
    }
}
