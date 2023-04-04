package Exercise;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();

        String searchBook = "";
        int countBooks = 0;
        while (!searchBook.equals("No More Books")) {
            searchBook = scanner.nextLine();
            if (searchBook.equals(book)) {
                break;
            } if (!searchBook.equals("No More Books")) {
                countBooks++;
            }
        }
        if (searchBook.equals(book)) {
            System.out.printf("You checked %d books and found it.", countBooks);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countBooks);
        }
    }
}
