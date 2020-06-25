package com.learning.datastructures;

import java.util.HashMap;

public class StringPrograms {
    //Write a Java Program to reverse a string without using String inbuilt function reverse()

        public static void main(String args[]){

            String s1 = reverseString("Hello");
            System.out.println("Reversed String : "+s1);

            occurrencesOfString("Dilemma");

            System.out.println(isPrime(7));

        }


        private static String reverseString(String s){
            char[] cArray = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            for(int i=cArray.length-1 ;i>=0;i--){
                sb.append(cArray[i]);
            }
            String reversed = sb.toString();
            return reversed;

        }

    //Write a Java program which prints number of occurrences of each characters in a string.

        static void occurrencesOfString(String s){
            //get the chars in String
            // char[] c = s.toCharArray();

            HashMap<Character,Integer> map = new HashMap<>();

            for(int i=0; i<s.length() ; i++){
                char ch = s.charAt(i);
                if(map.containsKey(s.charAt(i))){

                    map.put(ch,map.get(ch)+1);

                }
                else{
                    map.put(ch,1);
                }
            }
            for(Character c : map.keySet()){
                System.out.println(c+" : "+map.get(c));
            }
        }

   // Write a Java Program to find whether a number is prime or not.

        private static boolean isPrime(int n){
//n=8
            if(n>1){

                for(int i=2;i<n;i++){

                    if(n%i==0){
                        return false;
                    }

                }
                return true;

            }else{
                return false;

            }


    }
}

