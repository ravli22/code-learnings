package com.learning.datastructures;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SherlockAndValidString {
    // Complete the isValid function below.
    static String isValid(String s) {
        Map<Character,Integer> s_frequencies = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char key = s.charAt(i);
            if(s_frequencies.get(key) != null)
            {
                s_frequencies.put(key,s_frequencies.get(key)+1);
            }
            else{
                s_frequencies.put(key,1);
            }
        }

        List<Integer> mapValues = new ArrayList<>(s_frequencies.values());

        Set<Integer> diff_freq = new HashSet<>();
        diff_freq.addAll(mapValues);

        int max_freq=0;
        int min_freq=0;
        if(diff_freq.size()==1) {
            return "YES";
        }
        else {
            max_freq = Collections.max(diff_freq);
            min_freq = Collections.min(diff_freq);
            }

        int max_freq_count = 0;
        int min_freq_count = 0;
        for(Integer i : mapValues) {
            if(i==max_freq) {
                max_freq_count++;
            }
            else {
                min_freq_count++;
            }
        }

        return (min_freq_count==1 || (max_freq_count==1  && (max_freq-min_freq==1))) ? "YES" : "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String result = isValid("abcdefghhgfedecba"); //YES

        //aa bb cc dd eee ff gg hh
        //2   2   2  2  3 2  2  2
        //max_count= 3
        //min_count= 2
        //max_count_freq = 1
        //min_count_freq = 7

        String result1 = isValid("aabbcd");//NO
        String result2 = isValid("aabbccddeefghi");//NO

        System.out.println(result);

        System.out.println(result1);

        System.out.println(result2);

    }
}
