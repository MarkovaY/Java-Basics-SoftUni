package ForLoops;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int montBlanc = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;
        double totalPeople = 0;

        for (int i = 1; i <= groups; i++) {
            int numberPeople = Integer.parseInt(scanner.nextLine());
            totalPeople += numberPeople;

            if (numberPeople <= 5) {
                musala += numberPeople;
            } else if (numberPeople <= 12) {
                montBlanc += numberPeople;
            } else if (numberPeople <= 25) {
                kilimanjaro += numberPeople;
            } else if (numberPeople <= 40) {
                k2 += numberPeople;
            } else {
                everest += numberPeople;
            }
        }

        double percentMusala = musala / totalPeople * 100;
        double percentMontBlanc = montBlanc / totalPeople * 100;
        double percentKilimanjaro = kilimanjaro / totalPeople * 100;
        double percentK2 = k2 / totalPeople * 100;
        double percentEverest = everest / totalPeople * 100;

        System.out.printf("%.2f%%%n", percentMusala);
        System.out.printf("%.2f%%%n", percentMontBlanc);
        System.out.printf("%.2f%%%n", percentKilimanjaro);
        System.out.printf("%.2f%%%n", percentK2);
        System.out.printf("%.2f%%", percentEverest);

    }
}
