package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

import java.util.Collections;
import java.util.HashSet;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] inputArray = ArrayUtils.getInputArray();
        System.out.println(findMaximumProduct(inputArray));
    }
    static int findMaximumProduct(int[] arr){
        int product = 1;
        HashSet<Integer> products = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            product *= arr[i];
            if(product!=0){
                products.add(product);
            }else{
                product = 1;
            }
        }
        return Collections.max(products);
    }
}
