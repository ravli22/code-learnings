package com.learning.datastructures.arrays;

import java.util.Scanner;

public class NumberPresentOrNot {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Print the size of the array : ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Print the elements in the array : ");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Print the number to search in the array : ");
        int num = scan.nextInt();
        System.out.println(isPresent(arr,num,size));

    }
    static boolean isPresent(int[] arr,int num,int size){
        for(int i=0;i<size;i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }
}
