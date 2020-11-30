package Horsy.com.company.Ch07;

/*
(Count single digits) Write a program that generates 100 random integers between
0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 */

public class Exercise7_7CountSingleDigits {

    public static void main(String[] args) {
        int intArray[] = new int[10];

        //Generate 100 random integers between 0 and 9
        for (int i = 1, count = 1; i <= 100; i++){
            intArray[(int) (Math.random() * 10)]++;
            int randomNumber = (int) (Math.random() * 10);
        }

        //Display the count of each number
        for (int i = 0; i < intArray.length; i++){
            System.out.println("Amount of " + i + "'s are " + intArray[i]);
        }
       
    }
}
