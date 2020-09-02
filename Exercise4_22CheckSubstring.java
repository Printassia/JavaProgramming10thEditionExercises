package Horsy.com.company;

import java.util.Scanner;

/*
Write a program that prompts the user to enter two strings and
reports whether the second string is a substring of the first string.
 */

public class Exercise4_22CheckSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = input.next().toUpperCase();
        System.out.print("Enter string s2: ");
        String s2 = input.next().toUpperCase();
        
        if (s1.contains(s2)){
            System.out.println(s2 + " is a substring of " + s1);
        } 
        else System.out.println(s2 + " is not a substring of " + s1); 
        
    }
}
