package PrepExam;

import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        boolean isValid = false;

        for (int i = 0; i <=k ; i++) {
            for (int j = 9; j <= l ; j++) {
                for (int o = 0; o <= m; o++) {
                    for (int p = 9; p <= n ; p++) {

                        if (i % 2 == 0 && j % 2 != 0 && o % 2 == 0 && p % 2 != 0 && (i != o || j != p)){
                            isValid = true;
                        }
                    }
                }
            }
            if (isValid){
                System.out.printf("%d %d - %d %d", k, l, m, n);
            }else {
                System.out.println("Cannot change the same player.");
            }
        }
    }
}
