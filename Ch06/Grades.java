package Horsy.com.company.Ch06;

import java.util.Scanner;

/*
The program ask to input four student scores and return the letter grade of
each student
 */

public class Grades {
    public static char printGrade(double grade){
        if (grade >= 90.0) return 'A';
        else if (grade >= 80.0) return 'B';
        else if (grade >= 70.0) return 'C';
        else if (grade >= 60.0) return 'D';
        else return 'F';
    }

    public static void main(String[] args) {
        //Create scanner
        Scanner input = new Scanner(System.in);
        String name = "";
        char letterGrade = ' ';

        //Ask four times
        for (int loopCount = 1; loopCount <=4; loopCount++){
            //Prompt for student name
            System.out.print(loopCount + ". Student Name: ");
            name = input.next();

            //Prompt user to enter a score
            System.out.print("Score: ");
            letterGrade = printGrade(input.nextDouble());

            //Display Results
            System.out.println(name + "'s grade: " + letterGrade);
            //New Line
            System.out.println();
        }

    }
}
