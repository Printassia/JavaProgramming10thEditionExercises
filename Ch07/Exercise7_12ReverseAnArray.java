package Horsy.com.company.Ch07;

/*
(Reverse an array) The reverse method in Section  7.7 reverses an array by
copying it to a new array. Rewrite the method that reverses the array passed in
the argument and returns this array. Write a test program that prompts the user to
enter ten numbers, invokes the method to reverse the numbers, and displays the
numbers.
 */

import java.util.Scanner;

public class Exercise7_12ReverseAnArray {
    public static void main(String[] args) {
        System.out.print("Enter 10 numbers: ");
        int[] numbers = new int[10];
        //Store 10 numbers in the array variable numbers
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        //Invoke reverse method
        reverse(numbers);
        System.out.print("Reverse Order: ");
        for (int a = 0; a < numbers.length; a++){
            System.out.print(numbers[a] + " ");
        }
    }

    /** Reverse Method */
    public static void reverse (int[] array) {
        for (int a = 0, b = array.length - 1;
             a <= b; a++, b--) {
            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }
    }

}
