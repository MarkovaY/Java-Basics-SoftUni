package FirstSteps;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int packPens = Integer.parseInt(scanner.nextLine());
        int packMarkers = Integer.parseInt(scanner.nextLine());
        int cleaningProduct = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double pricePens = packPens * 5.80;
        double priceMarkers = packMarkers * 7.20;
        double priceProduct = cleaningProduct * 1.20;

        double totalPrice = pricePens + priceMarkers + priceProduct;

        double priceDiscount = totalPrice - (totalPrice * percent / 100);

        System.out.println(priceDiscount);
    }
}
