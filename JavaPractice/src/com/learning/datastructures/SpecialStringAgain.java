package com.learning.datastructures;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SpecialStringAgain {
    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        int ans = s.length();

        for(int i=0;i<s.length();i++) {

            int repeat = 0;
            //checking if the whole string is of same characters
            while(i+1 <s.length()  && (s.charAt(i)==s.charAt(i+1))) {
                repeat++;
                i++;
            }
            //apply the formula to calculate the special strings that are possible with
            //'n' same chars : n(n+1)/2

            ans += (repeat*(repeat+1))/2;

            //calculate the special strings where a String does not have all same chars

            int pointer = 1;
            while((i+pointer)<s.length() && (i-pointer)>=0
                    && (s.charAt(i+pointer) == s.charAt(i-1))
                    &&  (s.charAt(i-pointer)== s.charAt(i-1))
            )
            {
                ans++;
                pointer++;
            }
        }
        return ans;


    }


    public static void main(String[] args) throws IOException {

        String s1 = "asasd";//7
        String s2 = "abcbaba"; //10
        String s3 = "aaaa"; //10

        long result1 = substrCount(5, s1);
        long result2 = substrCount(7, s2);
        long result3 = substrCount(4, s3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        }
}

