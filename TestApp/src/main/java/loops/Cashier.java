package loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        double numInput = scanner.nextDouble();

        List<Double> list = new ArrayList<>();
        list.add(numInput);

        System.out.println("Do you want to add another number?");
        Scanner scanner1 = new Scanner((System.in));
        boolean addMore = scanner1.nextBoolean();

        double total = 0;

        while (addMore) {
            System.out.println("Enter a number");
           scanner = new Scanner(System.in);
           numInput = scanner.nextDouble();
           list.add(numInput);

            System.out.println("Do you want to add another number?");
           scanner1 = new Scanner((System.in));
           addMore = scanner1.nextBoolean();
        }
        //double[] numArray;
        //Double[] numArray = list.toArray(new Double[list.size()]);
        Double[] numArray = list.toArray(new Double[0]);

//        for (int i = 0; i < numArray.length; ++i) {
//            total += numArray[i];
//        }

        for (Double aDouble : numArray) {
            total += aDouble;
        }
        System.out.println(total);
    }
}
