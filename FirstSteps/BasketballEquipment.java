package FirstSteps;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int annualFee = Integer.parseInt(scanner.nextLine());

        double sneakersPrice = annualFee - (annualFee * 40 / 100.00);
        double outfitPrice = sneakersPrice - (sneakersPrice * 20 / 100);
        double ballPrice = outfitPrice / 4;
        double accessories = ballPrice / 5;

        double totalPrice = annualFee + sneakersPrice + outfitPrice + ballPrice + accessories;

        System.out.println(totalPrice);
    }
}
