package Horsy.com.company;

public class Exercise5_12 {
    /*
    (Find the smallest n such that n2 > 12,000) Use a while loop to find the smallest
    integer n such that n2 is greater than 12,000.
     */
    public static void main(String[] args) {
        int number = 0;
        //If the number squared is less than 12000 keep increasing the number
        while (number * number < 12000){
            number++;
        }
        System.out.println(number + " is the smallest integer n, " +
                "such that n^2 is greater than 12000.");
    }
}

