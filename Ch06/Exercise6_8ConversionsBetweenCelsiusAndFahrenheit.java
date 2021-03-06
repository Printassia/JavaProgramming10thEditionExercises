package Horsy.com.company.Ch06;

/*
(Conversions between Celsius and Fahrenheit) Write a class that contains the following two methods:
    Convert from Celsius to Fahrenheit
public static double celsiusToFahrenheit(double celsius)
    Convert from Fahrenheit to Celsius
public static double fahrenheitToCelsius(double fahrenheit)
        The formula for the conversion is:
        fahrenheit = (9.0 / 5) * celsius + 32
        celsius = (5.0 / 9) * (fahrenheit – 32)
Write a test program that invokes these methods to display the following tables:
Celsius Fahrenheit | Fahrenheit Celsius
 40.0    104.0     | 120.0      48.89
 39.0    102.2     | 110.0      43.33
...
 32.0    89.6      | 40.0       4.44
 31.0    87.8      | 30.0      -1.11
 */

public class Exercise6_8ConversionsBetweenCelsiusAndFahrenheit {

    /** Convert from Celsius to Fahrenheit */
    public static double celsiusToFahrenheit(double celsius){
        //Celsius to Fahrenheit formula
        double fahrenheit = (9.0 / 5) * celsius + 32;
        celsius = fahrenheit;
        return celsius;
    }

    /** Convert from Fahrenheit to Celsius */
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        fahrenheit = celsius;
        return fahrenheit;
    }

    /** Main method */
    public static void main(String[] args) {

        double fahrenheitToCelsius, celsiusToFahrenheit;

        //Display header
        System.out.println("Celsius\t\t\tFahrenheit | Fahrenheit\t\t\tCelsius");
        System.out.println("--------------------------------------------------------");

        for (celsiusToFahrenheit = 40.0, fahrenheitToCelsius = 120.0;
             celsiusToFahrenheit >= 31.0 && fahrenheitToCelsius >= 30.0;
             celsiusToFahrenheit--, fahrenheitToCelsius -= 10){
            //Display
            System.out.printf("%2.1f %16.1f      | %6.1f %18.2f \n",
                    celsiusToFahrenheit, celsiusToFahrenheit(celsiusToFahrenheit),
                    fahrenheitToCelsius, fahrenheitToCelsius(fahrenheitToCelsius));

        }






    }
}
