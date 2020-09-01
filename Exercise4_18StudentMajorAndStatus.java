package Horsy.com.company;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

/*
 Write a program that prompts the user to enter two
characters and displays the major and status represented in the
characters. The first character indicates the major and the second
is number character 1, 2, 3, 4, which indicates whether a student
is a freshman, sophomore, junior, or senior. Suppose the
following characters are used to denote the majors:
M: Mathematics
C: Computer Science
I: Information Technology pg. 178
 */
public class Exercise4_18StudentMajorAndStatus {
    public static void main(String[] args) {
        String character;
        char major, status;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        character = input.nextLine().toUpperCase();
        major = character.charAt(0);
        status = character.charAt(1);

        //Mathematics
        if (major == 'M' && status == '1'){
            System.out.println("Mathematics Freshman");
        }
        else if (major == 'M' && status == '2'){
            System.out.println("Mathematics Sophomore");
        }
        else if (major == 'M' && status == '3'){
            System.out.println("Mathematics Junior");
        }
        else if (major == 'M' && status == '4'){
            System.out.println("Mathematics Senior");
        }
        //CS
        else if (major == 'C' && status == '1'){
            System.out.println("Mathematics Freshman");
        }
        else if (major == 'C' && status == '2'){
            System.out.println("Computer Science Junior");
        }
        else if (major == 'C' && status == '3'){
            System.out.println("Computer Science Sophomore");
        }
        else if (major == 'C' && status == '4'){
            System.out.println("Computer Science Senior");
        }
        //IT
        else if (major == 'I' && status == '1'){
            System.out.println("Information Technology Freshman");
        }
        else if (major == 'I' && status == '2'){
            System.out.println("Information Technology Junior");
        }
        else if (major == 'I' && status == '3'){
            System.out.println("Information Technology Sophomore");
        }
        else if (major == 'I' && status == '4'){
            System.out.println("Information Technology Senior");
        }
        else System.out.println("Invalid Input");



    }
}
