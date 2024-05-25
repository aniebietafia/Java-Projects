package basics;

import java.util.Scanner;

public class SalesCalculator {
    public static void main(String[] args) {
        int quota = 10;

        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales >= quota) {
            System.out.println("Congratulations! You smashed it this week.");
        } else {
            int salesDiff = quota - sales;
            String message = salesDiff < 2 ? "You are " + salesDiff + " sale short" : "You're " + salesDiff + " sales short";
            System.out.println(message);
        }
    }
}
