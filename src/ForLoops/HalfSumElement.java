package ForLoops;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 1; i <= count; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (maxNumber < currentNumber) {
                maxNumber = currentNumber;
            }
            sum += currentNumber;
        }
        int sumNoMaxNum = sum - maxNumber;
        if (sumNoMaxNum == maxNumber) {
            System.out.println("Yes");
            System.out.printf("Sum =" + " " + "%d", maxNumber);
        } else {
            System.out.println("No");
            System.out.printf("Diff =" + " " + "%d", Math.abs(maxNumber - sumNoMaxNum));
        }
    }
}
