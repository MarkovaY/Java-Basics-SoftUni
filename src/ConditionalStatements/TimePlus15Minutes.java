package ConditionalStatements;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = hour * 60 + minutes + 15;
        int futureHour = totalMinutes / 60;
        int futureMin = totalMinutes % 60;


        if (futureHour == 24) {
            futureHour = 0;
        }
        if (futureMin < 10) {
            System.out.printf("%d:0%d", futureHour, futureMin);
        } else {
            System.out.printf("%d:%d", futureHour, futureMin);
        }
    }
}
