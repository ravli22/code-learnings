package com.learning.algorithm;

public class QuickSort {

    /**
     * 1) take a array of n elements. Eg. [2,6,1,3,0,10]
     * 2)select a pivot element. Eg. last element arr[arr.length-1]
     * 3)if a number is smaller than pivot , move it to the left of it
     * and if greater, move the element to the right of the pivot
     * 4)declare a partition method which should return partitionIndex or index of the pivot element,
     * which takes arr,startIndex , lastIndex as arguments
     * 5)declare i,j where j loops over the arr and i starts off with -1
     *
     *
     */

    public static void main(String[] args) {
        int[] arr = {2,10,6,52,14,1,9};
        //2,6,1,9,14,10,52
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr,0,arr.length-1);
        quickSort.printArray(arr);
    }
    private void sort(int[] arr,int begin,int end) {
        if(begin < end) {
            int partitionIndex = partition(arr,begin,end); //{2,10,6,52,14,1,9};

            sort(arr,partitionIndex+1,end);
            // 1 -  ip - {2,6,1,9,14,10,52},4,6 ..op - {2,6,1,9,14,10,52},4 ..
            // 2 -  ip -  {2,6,1,9,14,10,52},5,6.. op -  {2,6,1,9,10,14,52},6
         //   // 3 - ip - {2,6,1,9,14,10,52},4,5 .. op - {1,6,2,9,10,14,52},0

            sort(arr,begin,partitionIndex-1);
            //1 - ip - {2,6,1,9,10,14,52},0,2 .. op - {1,6,2,9,10,14,52},0
            //2 - ip - {1,6,2,9,10,14,52},1,2 .. op - {1,2,6,9,10,14,52},1
        }
    }



    private int partition(int[] arr,int begin,int end) {
        int pivot = arr[end];
        int i = begin - 1;

        for(int j=begin; j <= end; j++) {
            if(arr[j] < pivot) { //if an elem is less than pivot
                i++; //increment i
                int temp = arr[i]; // swap arr[i] and arr[j]
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //after the loop , swap pivot and arr[i+1]
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return i+1;
    }

    private void printArray(int[] arr) {
        for (int i: arr) {
            System.out.println(i);
        }
    }
}
