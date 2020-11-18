package Horsy.com.company.Ch06;

/*
(Financial application: compute commissions) Write a method that computes the
commission, using the scheme in Programming Exercise 5.39. The header of the
method is as follows:

public static double computeCommission(double salesAmount)

Write a test program that displays the following table:
    Sales Amount    Commission
    10000             900.0
    15000             1500.0
    ...
    95000             11100.0
    100000            11700.0
    pg.259

The rate for the first $5,000 is at 8%, the next $5000 is at 10%,
and the rest is at 12%. If the sales amount is 25,000,
the commission is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.
 */

public class Exercise6_11ComputeCommission {
    public static void main(String[] args) {
        //Header
        System.out.println("Sales Amount\t\t\tCommission");
        System.out.println("------------------------------------");

        /** computeCommission Method */
        for (int salesAmount = 10_000; salesAmount <= 100_000; salesAmount += 5000){
            System.out.println(salesAmount + "\t\t\t\t\t"
                    + computeCommission(salesAmount));
        }

    }

    public static double computeCommission(double salesAmount){
        double balance, commission;
        balance = commission = 0.0;

        /** if sales amount is $10,000.01 and above
        commission = 5000 * .08 * 5000 * .10 + (salesAmount - 10_000) .12)*/
        if (salesAmount >= 10_000.01)
            commission += (balance = salesAmount - 10_000) *.12;

        /** if salesAmount is >= 5000.01 commission = 5000 * .08 * 5000 * .10 */
        if (salesAmount >= 5000.01)
            commission += (balance -= balance - 5000) * .10;

        /** if sales amount is greater than or equal to 0.01
         double commission = 5000 * .08 */

        if (salesAmount >= 0.01) commission += balance * .08;

        /** Return Commission */
        return commission;
    }
}
