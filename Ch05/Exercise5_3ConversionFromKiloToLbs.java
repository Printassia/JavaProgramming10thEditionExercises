package Horsy.com.company;

import java.util.Scanner;
public class Exercise5_3ConversionFromKiloToLbs {
    public static void main(String[] args) {
      /*
      (Conversion from kilograms to pounds)
         Write a program that displays the following table (note that 1 kilogram is 2.2 pounds):
        Kilograms Pounds
         1         2.2
         3         6.6
        197       433.4
        199       437.8
        pg. 215
       */
        double kiloToPounds = 1;
        int count = 1;

        System.out.println("Kilograms    Pounds");

        while(count < 200) {
            //Convert Kilo to Lbs
            kiloToPounds = count * 2.2;
            //Output
            System.out.printf("%5d %11.1f \n", count , kiloToPounds);
            //Increase the count
            count++;
        }

    }

}
