package FirstSteps;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double length = Integer.parseInt(scanner.nextLine());
        double width = Integer.parseInt(scanner.nextLine());
        double height = Integer.parseInt(scanner.nextLine());
        double percentTaken = Double.parseDouble(scanner.nextLine());
        double percent = percentTaken / 100;
        double volumeCm = (length * width * height) / 1000;
        double totalVolume = volumeCm * (1 - percent);

        System.out.println(totalVolume);
    }
}
