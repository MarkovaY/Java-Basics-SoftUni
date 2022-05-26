package PrepExam;

import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int metersClimbed = Integer.parseInt(scanner.nextLine());

        int days = 1;

        int metersTotal = 5364;

        while (!command.equals("END")) {

            if (command.equals("Yes")) {
                days++;
            }
            if (days > 5) {
                System.out.printf("Failed!%n");
                System.out.println(metersTotal);
                break;
            }

            metersTotal += metersClimbed;

            if (metersTotal >= 8848) {
                System.out.printf("Goal reached for %d days!", days);
                break;
            }

            command = scanner.nextLine();

            if (command.equals("END")) {
                System.out.printf("Failed!%n");
                System.out.println(metersTotal);
                break;
            }

            metersClimbed = Integer.parseInt(scanner.nextLine());
        }

    }
}
