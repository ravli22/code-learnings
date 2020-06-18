package com.learning;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //main try-block
        try(Scanner scanner = new Scanner(new File("C:\\Users\\gudura3\\Workspace\\JavaPractice\\src\\com\\learning\\testRead.txt"))){
            try(PrintWriter writer = new PrintWriter(new File(""))) {
                while (scanner.hasNext()) {
                    writer.print(scanner.nextLine());
                }
        }


        } catch(FileNotFoundException e) {
            System.out.println("innerException caught" +e);
        }


    }
}