package Horsy.com.company;
/*
(Display the ASCII character table) Write a program that prints the characters in
the ASCII character table from ! to ~. Display ten characters per line.
Characters are separated by exactly one space.
 */
public class Exercise5_15 {
    public static void main(String[] args) {
        int count = 0;
        final int NUMBERS_PER_LINE = 10;

        //ASCII Characters table
        for (int ASCII = 33; ASCII <= 126; ASCII++ ){
            char convertASCII = (char) ASCII;

            count++; // Increase the count

            //Display 10 Characters per line
            if (count % NUMBERS_PER_LINE == 0) System.out.println(convertASCII);
            else System.out.print(convertASCII + " ");
        }
    }



}

