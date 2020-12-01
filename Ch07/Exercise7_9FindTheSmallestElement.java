package Horsy.com.company.Ch07;

import java.util.Scanner;

/*
(Find the smallest element) Write a method that finds the smallest element in an
array of double values using the following header:
public static double min(double[] array)
Write a test program that prompts the user to enter ten numbers, invokes this
method to return the minimum value, and displays the minimum value.
 */

public class Exercise7_9FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] values = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < values.length; i++){
            values[i] = input.nextDouble();
        }

        //Invoke the min method
        min(values);
    }

    public static double min(double[] array){
        double min = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] < min)
                min = array[i];
        }

        System.out.println("The minimum number: " + min);

        return min;

    }
}
