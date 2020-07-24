package com.learning.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class findDisappearedNumsFromIntArray {
    public static void main(String[] args) {

        Integer[] integers = new Integer[]{4,3,2,7,8,2,3,1};
        List<Integer> disappearedNumbers = findDisappearedNumbers( integers );
        disappearedNumbers.stream().forEach( System.out::println );
    }

    public static List<Integer> findDisappearedNumbers(Integer[] nums) {

        List<Integer> inputList = Arrays.asList(nums);

        List<Integer> listOfDisappearedNums=new ArrayList<>();
        for(int i = 1; i<=nums.length; i++){
/*
            if(!inputList.contains(i)){
                listOfDisappearedNums.add(i);
            }*/
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                    break;
                }

                if(j==nums.length-1){
                    listOfDisappearedNums.add(i);

                }


            }

        }

        return listOfDisappearedNums;
    }

    }



