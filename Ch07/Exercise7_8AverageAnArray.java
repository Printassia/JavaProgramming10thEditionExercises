package Horsy.com.company.Ch07;

/*
(Average an array) Write two overloaded methods that return the average of an
array with the following headers:
public static int average(int[] array)
public static double average(double[] array)
Write a test program that prompts the user to enter ten double values,
invokes this method, and displays the average value.
 */

import java.util.Scanner;

public class Exercise7_8AverageAnArray {
    public static void main(String[] args) {

        double[] values = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers to obtain the average: ");
        for (int i = 0; i < values.length; i++){
            values[i] = input.nextDouble();
        }

        //Invoke the double method & display the average value
        System.out.println(average(values));

    }
    /** Int average overloaded method */
    public static int average(int[] array){
        int average = 0;
        for (int i = 0; i < array.length; i++){
            average += array[i] / array.length;
        }
        return average;
    }

    /** Double overloaded method */
    public static double average(double[] array){
        double average = 0;

        for (int i = 0; i < array.length; i++){
            average += array[i] / array.length;
        }
        return average;
    }
}
