package ConditionalStatements;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int graphicCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double gpusPrice = graphicCards * 250;
        double processorsPrice = (gpusPrice * 0.35) * processors;
        double ramPrice = (gpusPrice * 0.1) * ram;
        double totalPrice = gpusPrice + processorsPrice + ramPrice;

        if (graphicCards > processors){
            totalPrice = totalPrice - totalPrice * 0.15;
        }

        if (budget >= totalPrice){
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(totalPrice - budget));
        }
    }
}
