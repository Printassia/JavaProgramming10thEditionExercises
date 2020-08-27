package Horsy.com.company;

import java.util.Scanner;

public class Exercise4_1AreaOfPentagon {
    /*
     * Question 4.1
     * Write a program that prompts the user to enter
     * the length from the center of a pentagon to a vertex and computes
     * the area of the pentagon, as shown in the following figure
     */

    public static double areaofPentagon() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double lengthOfCenter = input.nextDouble();

        //Side Formula
        double sideArea = 2 * lengthOfCenter * (Math.sin(Math.PI / 5));

        //Area of Pentagon Formula
        double area = (5 * sideArea * sideArea)
                / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The area of the pentagon is %.2f ", area);
        return area;

    }
    public static void main(String[] args) {
        areaofPentagon();

    }
}
