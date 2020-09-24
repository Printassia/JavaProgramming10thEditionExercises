package Horsy.com.company;

public class Exercise5_11 {
    public static void main(String[] args) {
        int count = 0;
        final int NUMBERS_PER_LINE = 10;

        //Display numbers between 100-1000
        for (int numbers = 100; numbers <= 200; numbers++) {
            //Not divisible by 5 and 6
            if (numbers % 5 == 0 ^ numbers % 6 == 0) {
                //Increase the count
                count++;
                //Numbers per line
                if (count % NUMBERS_PER_LINE == 0)
                    System.out.println(numbers);
                else System.out.print(numbers + " ");
            }

        }
    }
}
