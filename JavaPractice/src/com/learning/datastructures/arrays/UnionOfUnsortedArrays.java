package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

import java.util.HashSet;
import java.util.Set;

public class UnionOfUnsortedArrays {
    public static void main(String args[]){

        int[] arr1 = ArrayUtils.getInputArray();
        int[] arr2 = ArrayUtils.getInputArray();
        System.out.println("Union : "+findUnion(arr1, arr2));
    }
    static Set<Integer> findUnion(int[] arr1,int[] arr2){
        HashSet<Integer> union = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            union.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            union.add(arr2[j]);
        }
        return union;
    }
}
