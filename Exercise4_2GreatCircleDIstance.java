package Horsy.com.company;

import java.util.Scanner;

/*
 * Write a program that prompts the user to enter the latitude and longitude
 * of two points on the earth in degrees and displays its great circle distance.
 */
public class Exercise4_2GreatCircleDIstance {

    public static void greatCircileDistance(){
        double x1,y1,x2,y2,distance;
        double radius = 6371.01;
        Scanner input = new Scanner(System.in);

        //Prompt user to enter the first latitude and longitude points
        System.out.print("Enter point 1 (latitude and longitude) " +
                "in degrees: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();

        //Prompt user to enter the second latitude and longitude points
        System.out.print("Enter point 2 (latitude and longitude) " +
                "in degrees: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        //Convert degrees to radians
        double xOneToRadians = Math.toRadians(x1);
        double yOneToRadians = Math.toRadians(y1);
        double xTwoToRadians = Math.toRadians(x2);
        double yTwoToRadians = Math.toRadians(y2);

        //Compute the great circle distance between two points
        distance = radius * Math.acos((Math.sin(xOneToRadians))
                * Math.sin(xTwoToRadians)
                + Math.cos(xOneToRadians)
                * Math.cos(xTwoToRadians)
                * Math.cos(yOneToRadians - yTwoToRadians));

        //Output
        System.out.printf("The distance between the two points " +
                "is %f km" , distance);
    }
    public static void main(String[] args) {
        greatCircileDistance();
    }
}
