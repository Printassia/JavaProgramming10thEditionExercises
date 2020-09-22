package Horsy.com.company;

import java.util.Random;
import java.util.Scanner;

public class Exercise5_1PositiveAndNegativeNumbersAverage {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int positiveNumbers = 0, negativeNumbers = 0;
        String numberChoices;
        double total, average;
        int convertNumberChoicesToAnInteger = 0;
        while (convertNumberChoicesToAnInteger == 0) {

            //Input number of integer
            System.out.print("Enter an integer, the input ends if it is 0: ");
            numberChoices = input.nextLine();

            //Convert String to int
           // convertNumberChoicesToAnInteger = Integer.parseInt(numberChoices);

            if (convertNumberChoicesToAnInteger < 0) {
                negativeNumbers++;
            } else if (convertNumberChoicesToAnInteger > 0) {
                positiveNumbers++;
            } else {
                System.out.println("No numbers are entered except 0");
            }

            //
            total = positiveNumbers + negativeNumbers;
            average = total / 2;

            System.out.println("The number of positives is : "+ positiveNumbers);
            System.out.println("The number of negatives is : " + negativeNumbers);
            System.out.println("The total is : "+ total);
            System.out.println("The average is " + average);

            input.close();
        }

        }


    }

