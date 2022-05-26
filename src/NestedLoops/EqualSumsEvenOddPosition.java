package NestedLoops;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num2; i++) {
            int currentNum = i;
            int evenNum = 0;
            int oddNum = 0;

            for (int j = 6; j >= 0; j--) {

                int digit = currentNum % 10;

                if (j % 2 == 0) {
                    evenNum += digit;
                } else {
                    oddNum += digit;
                }

                currentNum = currentNum / 10;
            }
            if (evenNum == oddNum) {
                System.out.print(i + " ");
            }
        }
    }
}
