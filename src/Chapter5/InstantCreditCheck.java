package Chapter5;

/*
Write a credit check program that approves anyone who makes $25,000 and has a credit score of 700 or better. Reject all others.

 */

import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static  Scanner scanner = new Scanner(System.in);

    public static void main(String arg[]) {

        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        //check if user is qualified
        boolean qualified = isUserQualified(creditScore, salary);

        //notify the user
        notifyUser(qualified);
    }


    public static double getSalary() {
        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(int creditScore, double salary){
        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        }
        else{
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats, you've been approved");
        }
        else{
            System.out.println("Sorry, you did not qualify");
        }
    }
}
