package com.learning.datastructures;

import javax.sql.rowset.serial.SerialStruct;

public class AlmostPalindromeDemo {
    public static void main(String[] args) {
        //eg:BACBAB
        System.out.println(palindromByRemovingOneChar("BACAB"));
    }
    private static char palindromByRemovingOneChar(String s) {
        char[] chars = s.toCharArray();
        StringBuffer sb = new StringBuffer(s);
        char outcome = 0;
        for(int i=0; i<chars.length; i++) {
            if(isPalindrome(sb.replace(i,i+1,"").toString())) {
                outcome =  s.charAt(i);
                break;
            }
        }
        return outcome;
    }

    private static boolean isPalindrome(String s) {
        if(s.equalsIgnoreCase(reverseTheString(s))) {
            return true;
        }
        else {
            return false;
        }
    }
    private static String reverseTheString(String s) {
        char[] charArray = s.toCharArray();
        StringBuffer str = new StringBuffer();
        for(int i = charArray.length-1; i >= 0; i-- ) {
            str.append(charArray[i]);
        }
        return str.toString();
    }
}
