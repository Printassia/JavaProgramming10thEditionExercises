package Horsy.com.company.Ch07;

import java.util.Scanner;

/*
(Reverse the numbers entered) Write a program that prompts the user to enter
ten integers and displays them in the reverse of the order in which they were
entered.
 */

public class Exercise7_2ReverseTheNumbersEnteredPartII {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input 10 integers: ");

        int[] numbers = new int[10];

        for (int arrayLoop = 0; arrayLoop < numbers.length; arrayLoop++){
            int num = input.nextInt();
            numbers[arrayLoop] = num;
        }

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
