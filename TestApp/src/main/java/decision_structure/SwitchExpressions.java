package decision_structure;

import java.util.Scanner;

public class SwitchExpressions {
    public static void main(String[] args) {
        System.out.println("Enter a number from 0 - 6");
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();
        scanner.close();

        String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        String output = switch(dayOfWeek) {
            case 1 -> weeks[0];
            case 2 -> weeks[1];
            case 3 -> weeks[2];
            case 4 -> weeks[3];
            case 5 -> weeks[4];
            case 6 -> weeks[5];
            case 7 -> weeks[6];
            default -> throw new Error("Enter a valid day of the week");
        };

        System.out.println(output);
    };
}
