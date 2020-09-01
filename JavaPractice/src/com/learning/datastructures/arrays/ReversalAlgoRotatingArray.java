package com.learning.datastructures.arrays;

public class ReversalAlgoRotatingArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int rotations = 8;
        //if rotations value is greater than the length of the array, divide it by length and get the remainder as the rotations value
        rotations = rotations % arr.length;
        rotateTheArray(arr, rotations, arr.length);
        for (int i : arr) {
            System.out.println(i);
        }

    }

    static void rotateTheArray(int[] arr, int rotations, int length) {
        //{1,2,3,4,5,6,7}
        //rotated where rotations = 2; {3,4,5,6,7,1,2}
        System.out.println("rotations : " + rotations);
        reverse(arr, 0, rotations - 1);
        reverse(arr, rotations, length - 1);
        reverse(arr, 0, length - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        //{1,2}
        //{3,4,5,6,7}

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
