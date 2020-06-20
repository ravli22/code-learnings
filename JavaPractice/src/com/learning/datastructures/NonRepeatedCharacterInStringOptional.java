package com.learning.datastructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class NonRepeatedCharacterInStringOptional {
    public static void main(String[] args) {
        String s = "ggaayygag";
        Optional<Character> nonRepeatedCharacter = getFirstNonRepeatedCharacter(s);
        if(nonRepeatedCharacter.isPresent()) {
            System.out.println("Non repeated Character is : "+nonRepeatedCharacter.toString());
        } else
            System.out.println("There is no non-repeated Character in the String");

    }


public static Optional<Character> getFirstNonRepeatedCharacter(String s) {
    Map<Character,Integer> occurrences = new LinkedHashMap<>();
    for(int i=0;i<s.length();i++) {
        char c = s.charAt(i);
        if(occurrences.get(c)!=null)
        {
            occurrences.put(c,occurrences.get(c)+1);
        }
        else{
            occurrences.put(c,1);
        }
    }

    for(Map.Entry<Character,Integer> e : occurrences.entrySet()) {
        if(e.getValue()==1) {
            return Optional.of(e.getKey());
        }
    }
    return Optional.ofNullable(null);
}
}