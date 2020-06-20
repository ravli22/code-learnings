package com.learning.datastructures;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**  Problem Statement :
 * Minimum number of characters to be removed to make a binary string alternate
 * Given a binary string, the task is to find minimum number of characters to be removed from it so that it becomes alternate.
 * A binary string is alternate if there are no two consecutive 0s or 1s.
 *
 * For each query, print the minimum number of deletions required on a new line.
 *
 * Sample Input
 *
 * 5
 * AAAA
 * BBBBB
 * ABABABAB
 * BABABA
 * AAABBB
 * Sample Output
 *
 * 3
 * 4
 * 0
 * 0
 * 4


 **/


public class AlternatingCharacters {
    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        //s= A A B A A B
        //i= 0 1 2 3 4 5
        //count = 2
        char[] c = s.toCharArray();
        int min_deletions = 0;
        for(int i=0;i<c.length-1;i++) {
            if(c[i]==c[i+1]) {
                min_deletions++;
            }
        }
        return min_deletions;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
