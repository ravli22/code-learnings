package com.learning.datastructures.arrays.util;

import java.util.Scanner;

public class ArrayUtils {
    public static int[] getInputArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in the array : ");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.println(i);
        }
    }
}
