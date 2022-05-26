package ForLoops;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double laundryPrice = Double.parseDouble(scanner.nextLine());
        double pricePerToy = Double.parseDouble(scanner.nextLine());

        double money = 0;
        int toys = 0;
        int brother = 0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {

                if (i == 2) {
                    money = 10;
                } else {
                    money += 10.00 * i / 2;
                }
                brother++;

            } else {
                toys++;
            }
        }
        double totalMoney = money + (toys * pricePerToy) - brother;

        if (laundryPrice <= totalMoney) {
            System.out.printf("Yes! %.2f", totalMoney - laundryPrice);
        } else {
            System.out.printf("No! %.2f", laundryPrice - totalMoney);
        }

    }
}
