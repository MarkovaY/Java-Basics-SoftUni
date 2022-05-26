package WhileLoops;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());

        String nameProblem = scanner.nextLine();

        double allGrades = 0;
        double lowGrades = 0;
        int count = 0;
        String lastName = "";

        while (!nameProblem.equals("Enough")) {

            int grade = Integer.parseInt(scanner.nextLine());
            allGrades += grade;
            count++;
            lastName = nameProblem;

            if (grade <= 4) {
                lowGrades++;
            }

            if (lowGrades == badGrades) {
                System.out.printf("You need a break, %d poor grades.", badGrades);
                break;
            }

            nameProblem = scanner.nextLine();
        }
        if (nameProblem.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", allGrades / count);
            System.out.printf("Number of problems: %d%n", count);
            System.out.printf("Last problem: %s", lastName);
        }
    }
}
