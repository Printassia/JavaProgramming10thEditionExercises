package Horsy.com.company.Ch06;

import java.util.Scanner;

/*
(Display an integer reversed) Write a method with the following header to display
an integer in reverse order:
public static void reverse(int number)
For example, reverse(3456) displays 6543. Write a test program that prompts
the user to enter an integer and displays its reversal.
 */

public class Exercise6_4DisplayAnIntegerReversed {

    public static void reverse(int number){
        //Convert int to a String
        String convertToString = String.valueOf(number);
        //Create StringBuilder class to reverse string
        StringBuilder sb = new StringBuilder(convertToString);
        //Display
        System.out.println(number + " reversed is " + sb.reverse());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        //Invoke method
        reverse(number);
    }
}
