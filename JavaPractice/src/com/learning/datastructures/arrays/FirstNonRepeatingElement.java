package com.learning.datastructures.arrays;

import com.learning.datastructures.arrays.util.ArrayUtils;

import java.util.LinkedHashMap;
import java.util.Optional;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        int[] inputArray = ArrayUtils.getInputArray();
        findFirstNonRepeatingElement(inputArray);
    }

    static void findFirstNonRepeatingElement(int[] arr) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        Optional<Integer> first = map.keySet().stream()
                .filter(x -> (map.get(x) > 1))
                .findFirst();
        if (first.isPresent()) {
            System.out.println("First non-repeating element :" + first.get());
        } else {
            System.out.println("There are no non-repeating elements ");
        }
    }
}
