package JavaTests;

/*
Phone Bill Calculator
-Allow user to input plan fee and the number of overage minutes
-charge the user .25 for every minute they were over plan
-add the 15% tax
-Create separate methods to calculate tax, overage fees, and final total.
-print the itemized bill.
 */

import java.util.Scanner;

public class PhoneBillCalculator {

    public static void main(String arg[]) {

        //init the known
        System.out.println("Enter base cost of plan");
        Scanner scanner = new Scanner(System.in);
        double baseCost = scanner.nextDouble();

        System.out.println("Enter # of overage minutes");
        double overageMinutes = scanner.nextDouble();

       scanner.close();

        double overageCharge = calculateOverages(overageMinutes);
        double tax = calculateTax(baseCost + overageCharge);

        calculateAndPrintBill(baseCost, overageCharge, tax);
    }
    public static double calculateOverages(double extraMinutes) {
        double rate = 0.25;
        double overage = extraMinutes * rate;
        return overage;
    }
    public static double calculateTax(double total){
        double rate = 0.15;
        double tax = total * rate;
        return tax;
    }

    public static void calculateAndPrintBill(double base, double overage, double tax) {

        double finalTotal = base + overage + tax;

        System.out.println("Phone bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", base));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));
    }
}
