package loops;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        double rate = 15;
        double maxHours = 40;
        char symbol = '$';

        while (hoursWorked > maxHours || hoursWorked < 0) {
            System.out.println("Invalid input. Value must greater than 0 and less than 41.");
            if (hoursWorked < 0) {
                System.out.println("You cannot enter a negative value. Try again.");
            }
            scanner = new Scanner(System.in);
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        double newRate = rate * hoursWorked;
        System.out.println("Your rate for the week is: " + symbol + newRate);
    }
}
