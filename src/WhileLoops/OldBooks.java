package WhileLoops;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wantedBook = scanner.nextLine();

        String book = scanner.nextLine();
        int counter = 0;
        while (!book.equals("No More Books")){

            if (book.equals(wantedBook)){
                System.out.printf("You checked %d books and found it.",counter);
                break;
            }
            counter++;
            book = scanner.nextLine();
        }
        if (book.equals("No More Books")){
            System.out.printf("The book you search is not here!%n");
            System.out.printf("You checked %d books.", counter);
        }
    }
}
