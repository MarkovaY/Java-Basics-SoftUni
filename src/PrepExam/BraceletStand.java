package PrepExam;

import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyPerDay = Double.parseDouble(scanner.nextLine());
        double moneyEarned = Double.parseDouble(scanner.nextLine());
        double expenses = Double.parseDouble(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double totalIncome = moneyPerDay * 5 + moneyEarned * 5;
        double moneyFinal = totalIncome - expenses;

        if (moneyFinal >= giftPrice) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", moneyFinal);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", giftPrice - moneyFinal);
        }

    }
}
