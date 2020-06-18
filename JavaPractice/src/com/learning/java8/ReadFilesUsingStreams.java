package com.learning.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFilesUsingStreams {
    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("C:\\Users\\gudura3\\Workspace\\JavaPractice\\src\\com\\learning\\testRead.txt"))
                .filter(line->line.contains("Lambda"))
                .forEach(System.out::println) ;

    }
}
