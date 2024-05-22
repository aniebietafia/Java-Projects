package basics;

import java.util.Scanner;

public class LoopsAndArrays {
    public static void main(String[] args) {
        System.out.println("Enter a number to find the factorial");
        Scanner scanner = new Scanner(System.in);

        // While Loop
        int inputVal = scanner.nextInt();
        scanner.close();

        int factorial = 1;
        while (inputVal > 1) {
            factorial *= inputVal;
            inputVal--;
        }
        System.out.println(factorial);

        // Arrays
        double[] theVals = {10, 15, 12, 16};
        double sum = 0;

        for (int i = 0; i < theVals.length; ++i) {
            sum += theVals[i];
        }
        System.out.print("Sum of the Values: " + sum);
    }
}
