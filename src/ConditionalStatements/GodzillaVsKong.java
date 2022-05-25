package ConditionalStatements;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scanner.nextLine());
        int walkOns = Integer.parseInt(scanner.nextLine());
        double costumePrice = Double.parseDouble(scanner.nextLine());

        double totalCostumePrice = costumePrice * walkOns;
        if (walkOns > 150){
            totalCostumePrice = totalCostumePrice - (totalCostumePrice * 0.1);
        }
        double decorsPrice = movieBudget * 0.1;
        double totalPrice = decorsPrice + totalCostumePrice;

        if (totalPrice > movieBudget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(totalPrice - movieBudget));
        }else if (totalPrice <= movieBudget){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", movieBudget - totalPrice);
        }

    }
}
