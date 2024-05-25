package decision_structure;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {
        System.out.println("What is your test score?");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        scanner.close();

        char grade;
        String output = "Your grade is: ";

        if (score > 89) {
            grade = 'A';
        } else if (score > 69) {
            grade = 'B';
        } else if (score > 49) {
            grade = 'C';
        } else if (score > 39) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println(output + grade);
    }
}
