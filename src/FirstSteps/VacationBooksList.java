package FirstSteps;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            int bookPages = Integer.parseInt(scanner.nextLine());
            int pagesHour = Integer.parseInt(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());

            int totalHoursPerDay = (bookPages / pagesHour) / days;

            System.out.println(totalHoursPerDay);

        }


    }
}
