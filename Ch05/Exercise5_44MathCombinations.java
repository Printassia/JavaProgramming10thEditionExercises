package Horsy.com.company.Ch05;

public class Exercise5_44MathCombinations {
    public static void main(String[] args) {
        //Declaration statements
        int combinations = 0, numberOne, numberTwo;

        // Display all possible combination for
        // picking to numbers from integers 1 to 7
        for (numberOne = 1; numberOne < 7; numberOne++) {
            for (numberTwo = numberOne + 1; numberTwo <= 7; numberTwo++) {
                System.out.println(numberOne + " " + numberTwo);
                combinations++; // Increment count
            }
        }
        //Display the total number of all combinations
        System.out.println("Total number of all combinations is " + combinations);
    }
}
