package Horsy.com.company;

/*
(Display pyramid) Write a program that prompts the user to enter an integer from
1 to 15 and displays a pyramid, as shown in the following sample run:
Programming Exercises 193
Enter the number of lines: 7
                    1
                  2 1 2
                3 2 1 2 3
              4 3 2 1 2 3 4
            5 4 3 2 1 2 3 4 5
          6 5 4 3 2 1 2 3 4 5 6
        7 6 5 4 3 2 1 2 3 4 5 6 7
 */

import java.util.Scanner;

public class Exercise5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberCounter, numberCounterOne;
        int numberOfLines; //number of rows

        //Enter the number of lines
        System.out.print("Enter the number of lines: ");
        numberOfLines = input.nextInt();

        //Loop from 1 and 15
        for (int loopCounter = 1; loopCounter <= numberOfLines; loopCounter++) {

            //Create a space in each row
            for (int space = numberOfLines - loopCounter; space >= 1; space--) {
                System.out.print("  ");
            }
            //Descend the number in each row
            for (numberCounter = loopCounter; numberCounter >= 2; numberCounter--) {
                System.out.print(numberCounter + " ");
            }

            //Ascend the number in each row
            for (numberCounterOne = 1; numberCounterOne <= loopCounter; numberCounterOne++){
                System.out.print(numberCounterOne + " ");
            }
            System.out.println();
        }

    }

//        public static void main(String[] args) {
//            int rows = 8, k = 0;
//
//            for(int i = 1; i <= rows; ++i, k = 0) {
//                for(int space = 1; space <= rows - i; ++space) {
//                    System.out.print("  ");
//                }
//
//                while(k != 2 * i - 1) {
//                    System.out.print("* ");
//                    ++k;
//                }
//
//                System.out.println();
//            }
//        }
}



