package Horsy.com.company.Ch06;

/*
(Conversions between feet and meters) Write a class that contains the following
two methods:
Convert from feet to meters
public static double footToMeter(double foot)
Convert from meters to feet
public static double meterToFoot(double meter)
        The formula for the conversion is:
        meter = 0.305 * foot
        foot = 3.279 * meter
        Write a test program that invokes these methods to
        display the following tables:
        Feet Meters | Meters Feet
          1.0 0.305 | 20.0 65.574
          2.0 0.610 | 25.0 81.967
          ...
          9.0 2.745 | 60.0 196.721
         10.0 3.050 | 65.0 213.115
 */

public class Exercise6_9ConversionsBetweenFeetAndMeters {
    /** Convert from feet to meters */
    public static double footToMeter(double foot){
        double meter = 0.305 * foot;
        foot = meter;
        return foot;
    }
    /** Convert from meters to feet */
    public static double meterToFoot(double meter){
        double foot = 3.279 * meter;
        meter = foot;
        return meter;
    }
    /** Main method */
    public static void main(String[] args) {
        double feet, meters;

        //Display header
        System.out.println(" Feet\t  Meters    |     Meters   Feet");
        System.out.println("-----------------------------------------");

    for (feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters += 5){
        System.out.printf("%5.1f %10.3f    | %8.1f %10.3f \n",
                feet, footToMeter(feet), meters, meterToFoot(meters));
    }
    }
}
