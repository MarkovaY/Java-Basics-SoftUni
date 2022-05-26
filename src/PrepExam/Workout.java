package PrepExam;

import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double km = Double.parseDouble(scanner.nextLine());

        double dailyKm = km;
        for (int i = 1; i <= days; i++) {

            double percentsDaily = Double.parseDouble(scanner.nextLine());
            dailyKm = dailyKm + dailyKm * (percentsDaily / 100);
            km += dailyKm;
        }

        if (km >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(km - 1000));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - km));
        }

    }
}
