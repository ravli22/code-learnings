package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

public class QuickSortArrays {
    public static void main(String[] args) {
        int[] inputArray = ArrayUtils.getInputArray();
        quickSort(inputArray,0,inputArray.length-1);
        ArrayUtils.printArray(inputArray);
    }
    //sort
    static void quickSort(int[] arr,int low,int high){
        if(low<high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    //partitioning
    static int partition(int[] arr,int low,int high){
        //choosing pivot as last element in the array
        int pivot = arr[high];

        //index of smaller element
        int i = low-1;

        //traversing thru the array
        int temp;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){

                //swap the current element with smaller element
                i++;
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        //swap the smaller element index+1 with the pivot element(i.e.,element at high index)
        temp=arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;

    }

}
