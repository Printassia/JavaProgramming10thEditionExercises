package Horsy.com.company;

public class Exercise5_6 {
    /*
        (Conversion from miles to kilometers)
        Write a program that displays the following two tables side by side:
        Miles Kilometers | Kilometers Miles
        1 1.609 | 20 12.430
        2 3.218 | 25 15.538
        ...
        9 14.481 | 60 37.290
        10 16.090 | 65 40.398
         */
    public static void main(String[] args) {

       final double MILES_TO_KILOMETRES = 1.609;
        //Table Header
        System.out.println("Miles    Kilometers | Kilometres    Miles");

        //Miles to Kilometres & Kilometres to Miles
        for (int milesCount = 1, kilometersCount = 20; milesCount <= 10 && kilometersCount <= 65;
             milesCount++, kilometersCount +=5){

            //Miles to Kilometers Conversion
            double convertToKilometres = milesCount * MILES_TO_KILOMETRES;
            //Kilometers to Miles Conversion
            double convertToMiles = kilometersCount / MILES_TO_KILOMETRES;

            //Output
            System.out.printf("%2d %14.3f   | %4d %14.3f\n",
                    milesCount, convertToKilometres, kilometersCount, convertToMiles);

        }


    }
}
