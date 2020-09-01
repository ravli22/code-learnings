package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

import java.util.Scanner;

public class OccurrencesOfaNumberInArray {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[] arr = ArrayUtils.getInputArray();
        System.out.println("Enter the number to find the number of occurrences :");
        int n = scan.nextInt();
        System.out.println("the number of occurrences of "+n+" in the array : "+findOccurrencesofN(arr,n));
    }
    static int findOccurrencesofN(int[] arr, int n){
        int count = 0 ;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                count++;
            }
        }
        return count;
    }
}
