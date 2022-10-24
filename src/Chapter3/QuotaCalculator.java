package Chapter3;

import java.util.Scanner;

/*
IF ELSE
*All salespeople are expected to make at least 10 sales/week
*For those who do, they receive a congratulatory message .
*For those who don't, they're informed of how many sales they were short on.
 */
public class QuotaCalculator {
    public static void main(String args[]) {
        //initialize values we know
        int quota = 10;
        // Get values we don't
        System.out.println("Enter the number of sales you made this week.");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        //Make a decision on the path to take
        if(sales >= quota){
            System.out.println("Congrats! You've met your quota.");
        }
        else {
            int salesShort = quota - sales;
            System.out.println("You did not meet your quota, you were " + salesShort + " sales short");
        }
    }
}
