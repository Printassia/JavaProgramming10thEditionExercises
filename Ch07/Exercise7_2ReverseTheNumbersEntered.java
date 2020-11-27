package Horsy.com.company.Ch07;

import java.util.Scanner;

/*
(Reverse the numbers entered) Write a program that reads ten integers and
displays them in the reverse of the order in which they were read.
 */

public class Exercise7_2ReverseTheNumbersEntered {
    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400, 500, 600, 700 ,800 ,900, 1000};

        reverse(numbers);
        System.out.print("Reverse Order: ");
        for (int a = 0; a < numbers.length; a++){
            System.out.print(numbers[a] + " ");
        }
    }

    public static void reverse(int[] array){
        for (int i = 0, j = array.length - 1;
             i <= j; i++, j--){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

        }
    }
}
