package Horsy.com.company;

public class Exercise5_13 {
    /*
    (Find the largest n such that n3 > 12,000) Use a while loop to find the largest
    integer n such that n3 is less than 12,000.
     */
    public static void main(String[] args) {
        int number = 0;
        //If the number cubed is less than 12000 keep increasing the number
        while(Math.pow(number + 1, 3) < 12000){
            number++;
        }
        System.out.println(number + " is the largest integer n, " +
                "such that n^3 is less than 12000.");
    }
}
