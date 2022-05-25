package ConditionalStatements;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTrip = Double.parseDouble(scanner.nextLine());
        double puzzles = Double.parseDouble(scanner.nextLine());
        double dolls = Double.parseDouble(scanner.nextLine());
        double teddies = Double.parseDouble(scanner.nextLine());
        double minions = Double.parseDouble(scanner.nextLine());
        double trucks = Double.parseDouble(scanner.nextLine());

        double totalPuzzles = puzzles * 2.60;
        double totalDolls = dolls * 3;
        double totalTeddies = teddies * 4.10;
        double totalMinions = minions * 8.20;
        double totalTrucks = trucks * 2;

        double totalOrder = totalPuzzles + totalDolls + totalTeddies + totalMinions + totalTrucks;
        double totalToys = puzzles + dolls + teddies + minions + trucks;

        if (totalToys >= 50){
            totalOrder = totalOrder - (totalOrder * 0.25);
        }
        double profit = totalOrder - (totalOrder * 0.1);

        if (profit >= priceTrip){
            System.out.printf("Yes! %.2f lv left.", profit - priceTrip);
        } else{
            System.out.printf("Not enough money! %.2f lv needed.", priceTrip - profit);
        }
    }
}
