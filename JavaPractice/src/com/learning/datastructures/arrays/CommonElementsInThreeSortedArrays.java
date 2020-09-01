package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

public class CommonElementsInThreeSortedArrays {
    public static void main(String[] args) {
        int[] inputArray1 = ArrayUtils.getInputArray();
        int[] inputArray2 = ArrayUtils.getInputArray();
        int[] inputArray3 = ArrayUtils.getInputArray();
        findCommonElements(inputArray1,inputArray2,inputArray3);
    }
    static void findCommonElements(int[] arr1,int[] arr2,int[] arr3){
        int x=0,y=0,z=0;
        while(x<arr1.length && y<arr2.length && z<arr3.length){
            if((arr1[x]==arr2[y]) && (arr2[y]==arr3[z])){
                System.out.println(arr1[x]);
                x++;
                y++;
                z++;
            }else if(arr1[x] > arr2[y]){
                y++;
            }else if(arr2[y] > arr3[z]){
                z++;
            }else {
                x++;
            }
        }
    }
}
