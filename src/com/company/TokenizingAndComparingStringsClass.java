package com.company;

import java.util.Scanner;

public class TokenizingAndComparingStringsClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bCounter = 0;
        System.out.println("Enter a String:");
        String lineOfText = scanner.nextLine();
        
        String[] tokens = lineOfText.split(" ");

        for (String token : tokens) {
            if (token.startsWith("b")) {
                System.out.println(token);
                bCounter++;
            }
        }
        System.out.printf("Number of words that start with letter \"b\": %d", bCounter);
    }
}
