package WhileLoops;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double moneyAvailable = Double.parseDouble(scanner.nextLine());


        int countSpend = 0;
        int countDays = 0;

        while (moneyAvailable < moneyNeeded && countSpend < 5) {

            String action = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());

            if (action.equals("spend")) {
                moneyAvailable -= sum;
                countSpend++;
                countDays++;
            } else if (action.equals("save")) {
                moneyAvailable += sum;
                countDays++;
                countSpend = 0;
            }

            if (moneyAvailable < 0) {
                moneyAvailable = 0;
            }

        }
        if (countSpend == 5) {
            System.out.println("You can't save the money.");
            System.out.println(countDays);
        }

        if (moneyAvailable >= moneyNeeded) {
            System.out.printf("You saved the money for %d days.", countDays);
        }
    }
}
