package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

import java.util.HashMap;

public class FirstRepeatingElementInArray {
    public static void main(String[] args) {
        int[] inputArray = ArrayUtils.getInputArray();
        findFirstRepeatingElement(inputArray);
    }
    static void  findFirstRepeatingElement(int[] arr){
        int repeatingElement=-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                repeatingElement = arr[i];
                break;
            }
            else{
                map.put(arr[i],1);
            }
        }
      if(repeatingElement!=-1){
          System.out.println("The first repeating element is "+repeatingElement);
      }else{
          System.out.println("There are no repeating elements");
      }
    }
}
