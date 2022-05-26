package NestedLoops;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int primeNum = 0;
        int nonPrimeNum = 0;

        while (!command.equals("stop")) {
            int number = Integer.parseInt(command);

            if (number < 0) {
                System.out.println("Number is negative.");
                command = scanner.nextLine();
                continue;
            }
            boolean flag = true;

            for (int i = 2; i <= number - 1; i++) {
                if (number % i == 0) {
                    nonPrimeNum += number;
                    flag = false;
                    break;
                }
            }
            if (flag) {
                primeNum += number;
            }

            command = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeNum);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeNum);
    }
}
