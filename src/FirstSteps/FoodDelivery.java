package FirstSteps;

import java.util.Scanner;

public class FoodDelivery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int orderedChicken = Integer.parseInt(scanner.nextLine());
        int orderedFish = Integer.parseInt(scanner.nextLine());
        int orderedVegetarian = Integer.parseInt(scanner.nextLine());

        double totalChicken = orderedChicken * 10.35;
        double totalFish = orderedFish * 12.40;
        double totalVegetarian = orderedVegetarian * 8.15;
        double delivery = 2.50;
        double dessert = (totalChicken + totalFish + totalVegetarian) * 0.2;
        double totalPrice = totalChicken + totalFish + totalVegetarian + dessert + delivery;


        System.out.println(totalPrice);

    }
}
