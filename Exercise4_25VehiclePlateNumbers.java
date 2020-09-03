package Horsy.com.company;

import java.util.Random;

/*
Assume a vehicle plate number consists of three
uppercase letters followed by four digits. Write a program to generate a plate
number
 */

public class Exercise4_25VehiclePlateNumbers {
    public static void main(String[] args){
        Random random = new Random();

        //Characters
        char firstCharacter = (char) ('A' + random.nextInt(26));
        char secondCharacter = (char) ('A' + random.nextInt(26));
        char thirdCharacter = (char) ('A' + random.nextInt(26));

        //Random Numbers
        int firstRandomNumber = (int) (Math.random() * 10);
        int secondRandomNumber = (int) (Math.random() * 10);
        int thirdRandomNumber = (int) (Math.random() * 10);
        int fourthRandomNumber = (int) (Math.random() * 10);

        System.out.println(firstCharacter + "" + secondCharacter
                + "" + thirdCharacter + " " + firstRandomNumber +
                "" + secondRandomNumber + "" + thirdRandomNumber + ""
                + fourthRandomNumber);



    }
}
