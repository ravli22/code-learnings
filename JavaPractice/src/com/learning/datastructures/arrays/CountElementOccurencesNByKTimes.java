package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountElementOccurencesNByKTimes {
    public static void main(String[] args) {
        int[] inputArray = ArrayUtils.getInputArray();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter k value:");
        int k = scan.nextInt();
        findElementsOccurrences(inputArray,inputArray.length,k);
    }
    static void findElementsOccurrences(int[] arr,int n,int k){
        int x = n/k;
        HashMap<Integer,Integer> occurrences = new HashMap<>();
        for(int i=0;i<n-1;i++){
            if(occurrences.containsKey(arr[i])){
                occurrences.put(arr[i],occurrences.get(arr[i])+1);
            }else{
                occurrences.put(arr[i],1);
            }
        }
        List<Integer> collect = occurrences.keySet().stream()
                                                    .filter(key -> occurrences.get(key) > x)
                                                    .collect(Collectors.toList());
        System.out.println(collect);
    }
}
