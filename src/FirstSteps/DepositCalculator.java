package FirstSteps;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int periodMonths = Integer.parseInt(scanner.nextLine());
        double yearlyInterest = Double.parseDouble(scanner.nextLine());

        double endSum = depositSum + periodMonths * ((depositSum * (yearlyInterest / 100)) / 12);

        System.out.println(endSum);

    }
}
