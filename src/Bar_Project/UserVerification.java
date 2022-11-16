package Bar_Project;

//Welcome user
//Authenticate user age, deny any user who is not at least 21
//offer user a menu (1-10)

import java.util.Scanner;

public class UserVerification {

    static int requiredAge = 21;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String arg[]) {
        //get the known
        int age = getUserAge();

        scanner.close();

        //check if user is qualified
        verifyUserAge(age);

    }

    public static int getUserAge() {
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        return age;
    }
    public static boolean verifyUserAge(int age) {
        if (age >= requiredAge) {
            System.out.println("You're old enough to partake in the vices of alcohol...");
        } else {
            System.out.println("Run along youngin, you've got a ways to go...");
        }
        return false;
    }

}