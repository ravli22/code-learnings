package com.learning.datastructures;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MakingAnagrams {

      // Complete the makeAnagram function below.
        static int makeAnagram(String a, String b) {
            int min_deletions = 0;

            int[] a_frequencies = new int[26];
            int[] b_frequencies = new int[26];

            for(int i = 0 ; i < a.length(); i++) {
                int c = (int)a.charAt(i); //getting the ASCII value of the char
                int position = c-(int)'a';//get the correct postion of the char in the alphabet , (ASCII value of the char - ASCII value of a)
                a_frequencies[position]++; //increment the counter at that postion
            }
            for(int i = 0 ; i < b.length(); i++) {
                int c = (int)b.charAt(i); //getting the ASCII value of the char
                int position = c-(int)'a';//get the correct postion of the char in the alphabet , (ASCII value of the char - ASCII value of a)
                b_frequencies[position]++; //increment the counter at that postion
            }

            for(int i=0;i<26;i++) {
                min_deletions += Math.abs(a_frequencies[i]-b_frequencies[i]);
            }


            return min_deletions;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {

            System.out.println(makeAnagram("cde","dcf"));
            
        }

}
