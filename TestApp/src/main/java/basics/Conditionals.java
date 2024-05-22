package basics;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        System.out.println("How old are you?");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        scanner.close();

        String message;

        if (age > 18 && age < 26) {
            message = "You can own a car.";
            System.out.println(message);
        } else if (age == 18) {
            message = "You're qualified for a driver's license.";
            System.out.println(message);
        } else if (age > 25) {
            message = "You're a trainer now. Congratulations.";
            System.out.println(message);
        } else {
            message = "You're still a child.";
            System.out.println(message);
        }
    }
}
