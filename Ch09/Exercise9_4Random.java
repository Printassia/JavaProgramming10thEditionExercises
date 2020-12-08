package Horsy.com.company.Ch09;

import java.util.Random;

/*
(Use the Random class) Write a program that creates a Random object with seed
1000 and displays the first 50 random integers between 0 and 100 using the
nextInt(100) method.
 */

public class Exercise9_4Random {
    public static void main(String[] args) {
        Random random = new Random(1000);

        // displays the first 50 random integers between 0 and 100 using the
        //nextInt(100) method.
        for (int i = 1; i <= 50; i++) {
            System.out.println(random.nextInt(100));
        }
    }
}

