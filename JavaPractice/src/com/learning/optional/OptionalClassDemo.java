package com.learning.optional;

import java.util.Optional;

public class OptionalClassDemo {
    public static void main(String[] args) {
        //Without Optional
        //String[] strArr = new String[4];
        //String s = strArr[3].toLowerCase();
        //System.out.println(s);

        //Declaring using Optional
        String[] words = new String[4];
        Optional<String> checkNull = Optional.ofNullable(words[3]);
        if(checkNull.isPresent()) {
            String word= words[3].toLowerCase();
            System.out.println(word);
        }else {
            System.out.println("word is null");
        }


        test().ifPresent(String::toLowerCase);


        StringBuilder s = new StringBuilder();
        if(s!=null) {
            System.out.println("Printing s : "+s.toString());
        }
    }
    static  Optional<String> test() {
        return Optional.ofNullable(null);
    }
}

