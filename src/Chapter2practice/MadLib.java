package Chapter2practice;

import java.util.Scanner;

public class MadLib {
    public static void main(String arg[]){

        //1. season of the year?
        System.out.println("Enter a season of the year.");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        //2. whole number?
        System.out.println("Enter a whole number.");
        int whole = scanner.nextInt();

//        3.adjective?
        System.out.println("Enter an adjective");
        String adjective = scanner.next();
//        4. display result.
        System.out.println(" on a "  +  adjective  + " " + season  +  " day, I drink a minimum of "  +  whole  +  " cups of coffee. ");

    }
}
