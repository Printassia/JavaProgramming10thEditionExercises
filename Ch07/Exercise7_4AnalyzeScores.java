package Horsy.com.company.Ch07;

/*
(Analyze scores) Write a program that reads an unspecified number of scores and
determines how many scores are above or equal to the average and how many
scores are below the average. Enter a negative number to signify the end of the
input. Assume that the maximum number of scores is 100.
 */

import java.util.Scanner;

public class Exercise7_4AnalyzeScores {

    public static void main(String[] args) {
        int maximumNumber; //Assume the maximum number of scores is 100
        double total = 0, average = 0;

        //Reads an unspecified number of scores
        Scanner input = new Scanner(System.in);
        System.out.print("How many scores would you like to input? ");
        maximumNumber = input.nextInt();
        double scores[] = new double[maximumNumber];

        System.out.print("Enter the scores: ");
        for (int a = 0; a < maximumNumber; a++){
            scores[a] = input.nextDouble();

            //Input a negative number to signify the end of the input
            if (scores[a] < 0)
                break;

            //Sum of all numbers in the array
            total += scores[a];
        }

        //Average
        average = total / maximumNumber;
        System.out.println("The average is " + average);

        //Determine how many scores are above or equal to the average
        int highScoreCounter = 0, smallestScoreCounter = 0;
        for (int a = 0; a < scores.length; a++) {
            if (scores[a] >= average)
                highScoreCounter++;
            //Determine how many scores are below the average
            if (scores[a] < average)
                smallestScoreCounter++;
        }

        System.out.println("There are " + highScoreCounter +
                " score(s) that are above or equal to " + "the average,\n" +
                "and " + smallestScoreCounter +
                " score(s) that are below " + "the average. ");
    }
}
