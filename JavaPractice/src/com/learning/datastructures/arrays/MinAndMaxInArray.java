package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

import java.util.Arrays;

public class MinAndMaxInArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.getInputArray();
        System.out.println("Min element in the array :" + findMin(arr, arr.length) + "\nMax element in the array : " + findMax(arr, arr.length));
        System.out.println("Min element in the array using Streams :" + findMinUsingStreams(arr, arr.length) + "\nMax element in the array using Streams : " + findMaxUsingStreams(arr, arr.length));

    }

    static int findMin(int[] arr, int size) {
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int findMax(int[] arr, int size) {
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findMinUsingStreams(int[] arr, int size) {
        return Arrays.stream(arr).min().getAsInt();
    }

    static int findMaxUsingStreams(int[] arr, int size) {
        return Arrays.stream(arr).max().getAsInt();
    }
}
