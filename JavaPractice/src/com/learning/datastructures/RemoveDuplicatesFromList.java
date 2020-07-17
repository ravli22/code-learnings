package com.learning.datastructures;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        List<Integer> listWithDuplicates = Arrays.asList(1,2,8,9,6,5,6,9,8);
        removeDuplicatesUsingLinkedHashSet( listWithDuplicates ).forEach( System.out::println );
        System.out.println("------------------------------");
        removeDuplicatesUsingStream( listWithDuplicates ).forEach( System.out::println );
        System.out.println("------------------------------");
        removeDuplicatesUsingList( listWithDuplicates ).forEach( System.out::println );

    }
    static Set<Integer> removeDuplicatesUsingLinkedHashSet(List<Integer> list){
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        linkedHashSet.addAll( list );
        return linkedHashSet;
    }
    static List<Integer> removeDuplicatesUsingStream(List<Integer> list){
      return   list.stream()
                   .distinct()
                   .collect( Collectors.toList() );
    }
    static List<Integer> removeDuplicatesUsingList(List<Integer> list){
        List<Integer> listWithoutDuplicates = new ArrayList<>();
        for(Integer i : list){
            if(!listWithoutDuplicates.contains( i )){
                listWithoutDuplicates.add( i );
            }
        }
        return listWithoutDuplicates;
    }
}
