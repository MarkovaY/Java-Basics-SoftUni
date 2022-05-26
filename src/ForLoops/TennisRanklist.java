package ForLoops;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int pointsStart = Integer.parseInt(scanner.nextLine());
        double wins = 0;
        int points = 0;

        for (int i = 1; i <= tournaments; i++) {

            String result = scanner.nextLine();

            switch (result) {
                case "W":
                    points += 2000;
                    wins++;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;
            }

        }
        System.out.printf("Final points: %d%n", pointsStart + points);
        System.out.printf("Average points: %d%n", points / tournaments);
        System.out.printf("%.2f%%", (wins / tournaments) * 100);

    }
}
