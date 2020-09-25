package Horsy.com.company;

/*
(Compute the greatest common divisor) Another solution for Listing 5.9 to find
the greatest common divisor of two integers n1 and n2 is as follows: First find d
to be the minimum of n1 and n2, then check whether d, d-1, d-2, . . . , 2, or 1 is
a divisor for both n1 and n2 in this order. The first such common divisor is the
greatest common divisor for n1 and n2. Write a program that prompts the user to
enter two positive integers and displays the gcd.
 */

import java.util.Scanner;

public class Exercise5_14 {
    public static void main(String[] args) {
        int integer1, integer2;
        Scanner input = new Scanner(System.in);


        //Input integer 1
        System.out.print("Enter the first integer: ");
        integer1 = input.nextInt();
        //Input Integer 2
        System.out.print("Enter the second integer: ");
        integer2 = input.nextInt();
        //Initialize the greatest common divisor
        int gcd = 1;
        //Possible gcd
        int guess = 2;
        while (guess <= integer1 && guess <= integer2) {
            if (integer1 % guess == 0 && integer2 % guess == 0)
                gcd = guess;
            guess++;
        }
                System.out.println("The greatest common divisor for " + integer1 +
                        " and " + integer2 + " is " + gcd);
        }


    }

