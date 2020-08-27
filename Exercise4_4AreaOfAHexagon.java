package Horsy.com.company;

import java.util.Scanner;

/*
Write a program that prompts the user to enter the side of a hexagon
and displays its area.
 */
public class Exercise4_4AreaOfAHexagon {

    public static void areaofHexagon(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        //Area Formula
        double area = (6 * side * side) / (4 * Math.tan(Math.PI / 6));
        System.out.printf("The area of the hexagon is : %.2f " , area);
    }

    public static void main(String[] args) {
        areaofHexagon();
    }

}
