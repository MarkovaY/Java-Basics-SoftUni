package NestedLoops;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juryCount = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();

        double gradesSum = 0;
        int presentations = 0;
        while (!name.equals("Finish")) {
            double currentGrade = 0;
            presentations++;
            for (int i = 1; i <= juryCount; i++) {
                double grade = Double.parseDouble(scanner.nextLine());

                currentGrade += grade;


                gradesSum += grade;
            }
            System.out.printf("%s - %.2f.%n", name, currentGrade / juryCount);

            name = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", gradesSum / presentations / juryCount);
    }
}
