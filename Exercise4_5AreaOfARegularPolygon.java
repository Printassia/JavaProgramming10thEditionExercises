package Horsy.com.company;

import java.util.Scanner;

/*
 Write a program that prompts the user to enter the number of sides and
 their length of a regular polygon and displays its area.
 */

public class Exercise4_5AreaOfARegularPolygon {

    public static void areaOfRegularPolygon(){
        double n, lengthOfSide, area;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        n = input.nextDouble();

        System.out.print("Enter the side: ");
        lengthOfSide = input.nextDouble();

        //Formula
        area = n * lengthOfSide * lengthOfSide / (4 * Math.tan(Math.PI/n));
        System.out.printf("The area of the polygon is: %.2f " , area);
    }

    public static void main(String[] args) {
        areaOfRegularPolygon();

    }

}
