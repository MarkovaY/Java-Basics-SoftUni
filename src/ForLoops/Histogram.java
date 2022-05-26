package ForLoops;


import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double count1 = 0;
        double count2 = 0;
        double count3 = 0;
        double count4 = 0;
        double count5 = 0;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200) {
                count1 += 1;
                p1 = (count1 / n) * 100;
            } else if (number < 400) {
                count2 += 1;
                p2 = count2 / n * 100;
            } else if (number < 600) {
                count3 += 1;
                p3 = count3 / n * 100;
            } else if (number < 800) {
                count4 += 1;
                p4 = count4 / n * 100;
            } else if (number <= 1000){
                count5 += 1;
                p5 = count5 / n * 100;
            }
        }
        System.out.printf("%.2f%%%n" + "%.2f%%%n" + "%.2f%%%n" + "%.2f%%%n" + "%.2f%%%n", p1, p2, p3, p4, p5);
    }
}
