package PrepExam;

import java.util.Scanner;

public class UniquePIN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstDigit = Integer.parseInt(scanner.nextLine());
        int secondDigit = Integer.parseInt(scanner.nextLine());
        int thirdDigit = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= firstDigit; i++) {
            if (i % 2 == 0) {
                for (int j = 2; j <= secondDigit; j++) {
                    if (j == 2 || j == 3) {
                        for (int k = 1; k <= thirdDigit; k++) {
                            if (k % 2 == 0) {
                                System.out.printf("%d %d %d%n", i, j, k);
                            }
                        }
                    } else if (j % 2 != 0 && j % 3 != 0) {
                        for (int k = 1; k <= thirdDigit; k++) {
                            if (k % 2 == 0) {
                                System.out.printf("%d %d %d%n", i, j, k);
                            }

                        }
                    }
                }
            }
        }
    }
}