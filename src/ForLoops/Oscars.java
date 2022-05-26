package ForLoops;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int countJury = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countJury; i++) {

            String nameJury = scanner.nextLine();
            double pointsJury = Double.parseDouble(scanner.nextLine());
            int nameLength = nameJury.length();

            points = points + (nameLength * pointsJury) / 2;
            if (points >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, points);
                break;
            }
        }
        if (points < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actor, 1250.5 - points);
        }

    }
}
