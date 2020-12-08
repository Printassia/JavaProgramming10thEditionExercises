package Horsy.com.company.Ch09;

import java.util.GregorianCalendar;

/*
(Use the GregorianCalendar class) Java API has the GregorianCalendar class
in the java.util package, which you can use to obtain the year, month, and day of a
date. The no-arg constructor constructs an instance for the current date, and the methods get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH),
and get(GregorianCalendar.DAY_OF_MONTH) return the year, month, and day.
Write a program to perform two tasks:
 ■ Display the current year, month, and day.
 ■ The GregorianCalendar class has the setTimeInMillis(long), which
can be used to set a specified elapsed time since January 1, 1970. Set the value
to 1234567898765L and display the year, month, and day.
 */

public class Exercise9_5GregorianCalendar {
    public static void main(String[] args) {
        
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int year = gregorianCalendar.get(GregorianCalendar.YEAR);
        int month = gregorianCalendar.get(GregorianCalendar.MONTH);
        int dayOfMonth = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);

        switch (month){
            case GregorianCalendar.JANUARY:
                month = 1;
                break;
            case GregorianCalendar.FEBRUARY:
                month = 2;
                break;
            case GregorianCalendar.MARCH:
                month = 3;
                break;
            case GregorianCalendar.APRIL:
                month = 4;
                break;
            case GregorianCalendar.MAY:
                month = 5;
                break;
            case GregorianCalendar.JUNE:
                month = 6;
                break;
            case GregorianCalendar.JULY:
                month = 7;
                break;
            case GregorianCalendar.AUGUST:
                month = 8;
                break;
            case GregorianCalendar.SEPTEMBER:
                month = 9;
                break;
            case GregorianCalendar.OCTOBER:
                month = 10;
                break;
            case GregorianCalendar.NOVEMBER:
                month = 11;
                break;
            case GregorianCalendar.DECEMBER:
                month = 12;
                break;
        }

        System.out.print("The current year, month and day is ");
        System.out.println(year + " " + month + " " + dayOfMonth);

        long elapsedTimes = 1234567898765L;
        gregorianCalendar.setTimeInMillis(elapsedTimes);

        long elapsedYear = gregorianCalendar.get(GregorianCalendar.YEAR);
        long elapsedMonth = gregorianCalendar.get(GregorianCalendar.MONTH);
        long elapsedDayOfMonth = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("Elapsed Time 1234567898765, year " +
                "month and day is " + elapsedYear + " " + elapsedMonth + " "
        + elapsedDayOfMonth);

    }


}
