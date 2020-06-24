package com.learning.datastructures;

import java.util.*;
import java.util.stream.Stream;

public class WriteInBallots {
    public static void main(String[] args) {
        String[] arr = {"Zelda","Zelda","Joe","Joe","Mary"};
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        Integer max = Collections.max(map.values());

        TreeSet<String> sortedNames = new TreeSet<>();

        for(String s : map.keySet()){
            if(map.get(s)==max){
                sortedNames.add(s);
            }
        }
        System.out.println(sortedNames.last());
    }
}
