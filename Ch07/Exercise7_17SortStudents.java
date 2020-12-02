package Horsy.com.company.Ch07;

import java.util.Scanner;
import java.util.Arrays;

/*
(Sort students) Write a program that prompts the user to enter the number of
students, the students’ names, and their scores, and prints student names in
decreasing order of their scores.
 */

public class Exercise7_17SortStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many students are in the class: ");
        int numberOfStudents = input.nextInt();
        //Array to store the total number of students from the input
        int[] totalNumberOfStudents = new int[numberOfStudents];
        //Array to store the students name
        String[] studentName = new String[numberOfStudents];
        //Array to store the students score
        int[] studentScore = new int[numberOfStudents];


        //For Loop to input the students name in an array of String

        for (int i = 0;
             i < studentName.length && i < studentScore.length;
             i++) {
            System.out.print(" Student " + i + " name: ");
            studentName[i] = input.next();

            System.out.print(" Student " + i + " score: ");
            studentScore[i] = input.nextInt();
        }

        //prints student names in decreasing order of their scores.
        for (int i = 0;
             i < studentName.length && i < studentScore.length;
             i++) {
            Arrays.sort(studentScore);
            Arrays.toString(studentScore);
            Arrays.sort(studentName);
            System.out.println(studentName[i] + ", Score: " +
                   studentScore[i]);
        }
    }
}














//
//        int minimumScore = studentScore[0];
//        for (int i = 0; i < totalNumberOfStudents.length; i++){
//            if (totalNumberOfStudents[i] < minimumScore){
//                minimumScore = totalNumberOfStudents[i];
//            }
//
//            System.out.println(studentName + " " + minimumScore);
//        }


    //        double min = numbers[0];
//        for (int x = 0; x < numbers.length; x++){
//            if (numbers[x] < min)
//                min = numbers[x];
//        }
//        System.out.println("The minimum element in array is " +min);




