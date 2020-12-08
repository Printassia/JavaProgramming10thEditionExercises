package Horsy.com.company.Ch09;

import java.util.Date;

/*
(Use the Date class) Write a program that creates a Date object, sets its elapsed
time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
10000000000, and 100000000000, and displays the date and time using the
toString() method, respectively
 */

public class Exercise9_3Date {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println("The dates and times of  elapsed times 10000, "  +
                "100000, 1000000, 10000000,\n100000000, 1000000000, 10000000000," +
                " and 100,000,000,000, respectively: ");

        for (long i = 1000; i <= 1e11; i *= 10){
            date.setTime(i);
            System.out.println(date.toString());
        }
    }
}
