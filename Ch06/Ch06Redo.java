package Horsy.com.company.Ch06;

public class Ch06Redo {
    //Listing 6.3: Test Return Grade Method
    public static char getGrade(double score){
        if (score >= 90.0) return 'A';
        else if (score >= 80.0) return 'B';
        else if (score >= 70.0) return 'C';
        else if (score >= 60.0) return 'D';
        else return 'F';
    }
    public static void main(String[] args) {
        System.out.print("The grade is " + getGrade(45));
    }
    }

    /*
    //6.1: Introduction
    public static int sum(int startingInteger, int endingInteger){
        int result = 0;
        for (int i = startingInteger; i <= endingInteger; i++){
            result += i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sum of numbers from 1 to 10: " + sum(1, 10));
        System.out.println("Sum of numbers from 20 to 37: " + sum(20, 37));
        System.out.println("Sum of numbers from 35 to 49: " + sum(35, 49));
        }

        //Listing 6.1: Test Max
    public static int max(int num1, int num2){
        int results;
        if (num1 > num2){
            results = num1;
            System.out.print("The max between " + num1 + " and " + num2 +
                    " is ");
        }
        else{
            results = num2;
            System.out.print("The max between " + num1 + " and " + num2 +
                    " is ");
        }
        return results;
    }

    public static void main(String[] args) {
        System.out.println(max(16, 8));
    }

    //Listing 6.2: Test Void Method
    public static void printGrade(double grade){
        if (grade > 90.0) System.out.println("A");
        else if (grade >= 80.0) System.out.println("B");
        else if (grade >= 70.0) System.out.println("C");
        else if (grade >= 60.0) System.out.println("D");
        else System.out.println("F");

    }
    public static void main(String[] args) {
        System.out.print("The grade is: ");
        printGrade(80);
    }


     */
