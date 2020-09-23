package Horsy.com.company;

public class Exercise5_5ConvertKilogramsToPoundsAndBack {
    public static void main(String[] args) {

        //Table Header
        System.out.println("Kilograms    Pounds | Pounds    Kilograms");

        //Part I: Kilograms to Pounds & Pounds to Kilograms
        for (int count = 1, count2 = 20; count < 200 && count2 <= 516; count +=2, count2 +=5) {

            //Convert kilograms to lbs
            double kilogramsToLbs = count * 2.2;

            //Convert lbs to kilograms
            double poundsToKiloGrams = count2 / 2.2;

            //Output
            System.out.printf("%2d %14.1f   | %2d %14.1f\n",
                    count, kilogramsToLbs, count2, poundsToKiloGrams);


        }


    }
}
