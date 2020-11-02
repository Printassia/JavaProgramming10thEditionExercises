package Horsy.com.company.Ch05;

import java.util.Scanner;

/*
(Occurrence of max numbers) Write a program that reads integers,
finds the largest of them, and counts its occurrences.
Assume that the input ends with number 0.
Suppose that you entered 3 5 2 5 5 5 0; the program finds that the largest
is 5 and the occurrence count for 5 is 4.
(Hint: Maintain two variables, max and count. max stores the current max number,
 and count stores its occurrences. Initially, assign the first number to max
and 1 to count. Compare each subsequent number with max. If the number is
greater than max, assign it to max
 */

public class Exercise5_41OccurrenceOfMaxNumbers {
    public static void main(String[] args) {

        //Declaration statements
        int number, maxNumber, occurrences = 1;

        //Scanner class
        Scanner input = new Scanner(System.in);
        //Enter numbers
        System.out.println("Enter numbers: ");
        number = input.nextInt();

        //find the largest(max) from a range of numbers(input)
        maxNumber = number;

        //Input ends with 0
        while (number != 0){
            number = input.nextInt();

            if (number > maxNumber){
                occurrences--;
                maxNumber = number;
            }
            if (number == maxNumber){
                occurrences++;
            }
        }
        System.out.println("max is " + maxNumber);
        System.out.println("occurrences , is " + occurrences);
    }
}