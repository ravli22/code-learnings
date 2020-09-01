package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

public class MinElementInSortedRotatedArray {
    public static void main(String[] args) {
        int[] inputArray = ArrayUtils.getInputArray();
        System.out.println(findMin(inputArray,0,inputArray.length-1));
    }
    //Using Binary search approach
    static int findMin(int[] arr,int low, int high){

        //case : if there is only one element in the array
        if(low == high){
            return arr[low];
        }
        //case : if the array is not rotated
        if(arr[low]<arr[high]){
            return arr[low];
        }

        //calculate mid of the array
        int mid = low+(high-low)/2;

        //case : if mid element is the min element
        if((mid<high) && (arr[mid]<arr[mid+1] && arr[mid]<arr[mid-1])){
            return arr[mid];
        }

        //case : if the min element is in left of the array or in the right of the array
        if(mid<high && arr[mid]<arr[high]){
            return findMin(arr,low,mid-1);
        }else{
            return findMin(arr,mid+1,high);
        }

    }
}
