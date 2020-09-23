package Horsy.com.company;

public class Exercise5_7 {
    /*
(Financial application: compute future tuition) Suppose that the tuition for a university
is $10,000 this year and increases 5% every year. In one year, the tuition
will be $10,500. Write a program that computes the tuition in ten years and the
total cost of four years’ worth of tuition after the tenth year.
        -Tuition is $10,000
        -Increase 5% every year
        -In 1 year tuition will be $10,500
        -Compute the tuition in 10 years
        -Compute 4 years(14) worth of tuition after the 10th year
         */

    public static void main(String[] args) {
        double tuition = 10_000;
        final double TUITION_YEARLY_INCREASE = 1.05;

        //The initial tuition
        System.out.printf("Initial Tuition is $%.2f\n", tuition);
        for (int year = 1; year <= 14; year++) {
            //Increase the tuition by 5%
            tuition = tuition * TUITION_YEARLY_INCREASE;
            //Output for Years 10 and 14 $$ Worth of Tuition
            if (year == 14 || year == 10){
                System.out.printf("Tuition in year %d is $%.2f \n", year, tuition);
            }
        }

    }
}





