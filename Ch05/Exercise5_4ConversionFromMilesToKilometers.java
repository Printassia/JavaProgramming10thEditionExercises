package Horsy.com.company;

public class Exercise5_4ConversionFromMilesToKilometers {
    public static void main(String[] args) {
        /*
        (Conversion from miles to kilometers)
        Write a program that displays the following table
        (note that 1 mile is 1.609 kilometers):
        Miles Kilometers
        1       1.609
        2       3.218
        ...
        9      14.481
        10     16.090
         */

        System.out.println("Miles    Kilometres");

        for (int count = 1; count <= 10; count++){
            //Convert miles to kilometres
            double milesToKilometres = count * 1.609;
            //Output
            System.out.printf("%2d %12.3f\n", count , milesToKilometres);
        }
    }
}
