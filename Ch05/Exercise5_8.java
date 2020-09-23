package Horsy.com.company;

import java.util.Scanner;

public class Exercise5_8 {
    /*
    (Find the highest score) Write a program that prompts the user to enter the number
    of students and each student’s name and score, and finally displays the name
    of the student with the highest score
    -Scanner to input number of students, students name, students score
    -Display name of student with the highest score
     */
    public static void main(String[] args) {
        //Scanner class
        Scanner input = new Scanner(System.in);

        String highestScoreStudentName = "";
        int highestScore = 0;

        //Input the number of students
        System.out.print("Input the number of student(s): ");
        int numberOfStudent = input.nextInt();

        for (int counter = 1; counter <= numberOfStudent; counter++) {

            //Input the name of each student(s)
            System.out.print("Student " + counter + "\n\tName: ");
            String studentName = input.next();

            //Input the student(s) score
            System.out.print("\tScore: ");
            int studentScore = input.nextInt();

            //Find the highest score
            if (studentScore > highestScore) {
                highestScore = studentScore;
                highestScoreStudentName = studentName;
            }
        }

        //Output
        System.out.println(highestScoreStudentName + " has the highest score of " + highestScore);
    }
}



