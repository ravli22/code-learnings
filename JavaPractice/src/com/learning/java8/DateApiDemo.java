package com.learning.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateApiDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Today's date : "+today);
        System.out.println("Time now : "+time);
        System.out.println("Today's Date and Time : "+dateTime);
    }
}
