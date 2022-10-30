package Chapter4;

/*WHILE LOOP:
*Each store employee makes $15/hr. Write a program that allows employees to enter the number of hours worked for the week. Do not allow overtime.
 */

import java.util.Scanner;

public class GrossPayInputValidation{
    public static void main(String arg[]) {
    // init known values
    int rate = 15;
    int maxHours = 40;

    //Get input for unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Validate input
        while(hoursWorked > maxHours || hoursWorked < 1) {
            System.out.println("Invalid entry. Yours hours must be between 1 and 40.");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        //Calculate gross pay
        double gross = rate * hoursWorked;
        System.out.println("Gross pay: $" + gross);
    }


}

