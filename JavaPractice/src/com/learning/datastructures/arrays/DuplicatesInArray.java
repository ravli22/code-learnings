package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] inputArray = ArrayUtils.getInputArray();
        List<Integer> list = findDuplicates(inputArray);
        if(list.size()!=0 ){
            System.out.println(list);
        }
        else
        {
            System.out.println("-1");
        }

    }
    static List<Integer> findDuplicates(int arr[]){
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();
        for(int i=0; i<arr.length;i++){
            if(map.containsKey(arr[i])){
               duplicates.add(arr[i]);
            }
            else{
                map.put(arr[i],1);
            }
        }
        return duplicates;
    }
}
