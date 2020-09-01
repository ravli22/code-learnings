package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int[] inputArray = ArrayUtils.getInputArray();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sum to find out number of pairs : ");
        int sum = scan.nextInt();
        System.out.println("Number of pairs with given sum are : "+countPairs(inputArray,sum));
    }
    static int countPairs(int[] arr,int sum){
        //get the frequency of each array element and store it in a hashmap
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        int counting_twice = 0;
        //iterate over the array and get the frequency of (sum-arr[i]) from map,
        //if it is not null, add the frequency to the count
        //to eliminate the sum-arr[i]=arr[i] case, we are decrementing the count if it matches this condition
        for(int i=0;i<arr.length;i++){
            if(map.get(sum-arr[i])!=null){
                counting_twice += map.get(sum-arr[i]);
            }
            if(sum-arr[i]==arr[i]){
                counting_twice--;
            }
        }
        return (counting_twice==0) ? 0 : counting_twice/2;
    }
}
