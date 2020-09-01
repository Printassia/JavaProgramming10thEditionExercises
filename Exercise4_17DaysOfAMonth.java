package Horsy.com.company;

import java.util.Scanner;

/*
Write a program that prompts the user to enter a year and the
first three letters of a month name
(with the first letter in uppercase) and displays
the number of days in the month.
 */
public class Exercise4_17DaysOfAMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        short year = input.nextShort();

        System.out.print("Enter a month: ");
        String month = input.next();

        byte twentyEight = 28;
        byte leapYear = 29;
        byte thirty = 30;
        byte thirtyOne = 31;


        if (month.equalsIgnoreCase("Jan")) {
            System.out.println(month + " " + year + " has " +
                    thirtyOne + " days");
        }
        //Feb leap year
        else if (month.equalsIgnoreCase("Feb") && year % 4 == 0) {
            System.out.println(month + " " + year + " has " +
                    leapYear + " days");
        }
        else if (month.equalsIgnoreCase("Feb")) {
            System.out.println(month + " " + year + " has " +
                    twentyEight + " days");
        }
         else if (month.equalsIgnoreCase("Mar")) {
            System.out.println(month + " " + year + " has " +
                    thirtyOne + " days");
        } else if (month.equalsIgnoreCase("Apr")) {
            System.out.println(month + " " + year + " has " +
                    thirty + " days");
        } else if (month.equalsIgnoreCase("May")) {
            System.out.println(month + " " + year + " has " +
                    thirtyOne + " days");
        } else if (month.equalsIgnoreCase("Jun")) {
            System.out.println(month + " " + year + " has " +
                    thirty + " days");
        } else if (month.equalsIgnoreCase("Jul")) {
            System.out.println(month + " " + year + " has " +
                    thirtyOne + " days");
        } else if (month.equalsIgnoreCase("Aug")) {
            System.out.println(month + " " + year + " has " +
                    thirtyOne + " days");
        } else if (month.equalsIgnoreCase("Sep")) {
            System.out.println(month + " " + year + " has " +
                    thirty + " days");
        } else if (month.equalsIgnoreCase("Oct")) {
            System.out.println(month + " " + year + " has " +
                    thirtyOne + " days");
        } else if (month.equalsIgnoreCase("Nov")) {
            System.out.println(month + " " + year + " has " +
                    thirty + " days");
        } else if (month.equalsIgnoreCase("Dec")) {
            System.out.println(month + " " + year + " has " +
                    thirtyOne + " days");
        }
         
    }
}
