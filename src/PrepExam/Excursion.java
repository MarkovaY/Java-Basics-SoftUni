package PrepExam;

import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int cards = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());

        double priceNight = 20;
        double priceCard = 1.60;
        double priceTicket = 6;

        double pricePerPerson = nights * priceNight + cards * priceCard + tickets * priceTicket;
        double totalPrice = pricePerPerson * people;
        double unexpectedExpenses = totalPrice * 0.25;
        totalPrice += unexpectedExpenses;

        System.out.printf("%.2f", totalPrice);

    }
}
