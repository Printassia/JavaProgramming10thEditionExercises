package Horsy.com.company.Ch05;

/*
(Simulation: heads or tails) Write a program that simulates flipping a coin one
million times and displays the number of heads and tails.
 */

import java.util.Random;

public class Exercise5_40SimulationHeadsOrTails {
    public static void main(String[] args) {

        //Declaration Statements
        int oneMillion = 1_000_000;
        int head = 0, tail = 0, headCount = 0, tailCount = 0;

        //Random Math
        Random random = new Random();

        //Flip the coin 1,000,000 times
        for (int flipCoin = 1; flipCoin <= oneMillion; flipCoin++ ){

            //Random number between 0 & 1;
            int coinToss = random.nextInt(2);

            //if the coin toss is 0
            if (coinToss == 0){
                head++; //increase the head
                headCount += head;
            }
            //if coin toss is 1
            if (coinToss == 1){
                tail++;
                tailCount += tail;
            }
        }
        //Display the number of heads and tails
        System.out.println("Total number of heads: " + headCount);
        System.out.println("Total number of tails: " + tailCount);

    }
}
