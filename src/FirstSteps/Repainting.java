package FirstSteps;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int workingHours = Integer.parseInt(scanner.nextLine());

        double totalNylon = (nylon + 2) * 1.50;
        double totalPaint = (paint + (paint * 10 / 100.00)) * 14.50;
        double totalThinner = thinner * 5.00;

        double priceMaterials = totalNylon + totalPaint + totalThinner + 0.40;
        double priceWork = (priceMaterials * 30 / 100) * workingHours;
        double totalPrice = priceMaterials + priceWork;

        System.out.println(totalPrice);
    }
}
