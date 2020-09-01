package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

public class AlternatingPositiveNegative {
    public static void main(String[] args) {
        int[] inputArray = ArrayUtils.getInputArray();
        alternatePositions(inputArray);
        ArrayUtils.printArray(inputArray);
    }
    static void alternatePositions(int[] arr){
        int temp;
        for(int i=0;i<arr.length-1;i++){
            int j=i;
            boolean swapped = false;
            if(!((arr[i]<0 && arr[i+1]>0) || (arr[i]>0 && arr[i+1]<0))){
                while(j<arr.length){
                    if((arr[i]<0 && arr[j]>0) || (arr[i]>0 && arr[j]<0)){
                        temp = arr[i+1];
                        arr[i+1] = arr[j];
                        arr[j] = temp;
                        swapped = true;
                    }
                    if(swapped==true){
                        break;
                    }
                    j++;
                }
            }
        }
    }
}
