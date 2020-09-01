package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

import java.util.Scanner;

public class KthSmallestOrLargestElement {
    public static void main(String args[]){
        int[] arr = ArrayUtils.getInputArray();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the K value : ");
        int k = scan.nextInt();
        //sort the array
        BubbleSort.sort(arr,arr.length);
        //get the Kth smallest element in the array
        int smallest = getKthSmallest(k,arr);
        int largest = getKthLargest(k,arr);
        System.out.println(k+"th smallest element : "+smallest+"\n"+k+"th largest element :"+largest);
    }
    public static int getKthSmallest(int k,int[] arr){
        return arr[k-1];
    }
    public static int getKthLargest(int k,int[] arr){
        return arr[arr.length-k];
    }
}
