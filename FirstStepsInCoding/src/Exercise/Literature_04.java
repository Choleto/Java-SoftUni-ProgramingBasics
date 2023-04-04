package Exercise;

import java.util.Scanner;

public class Literature_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPages = Integer.parseInt(scanner.nextLine());
        int pages = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int totalTime = numPages / pages;
        int neededHours = totalTime / days;
        System.out.println(neededHours);

    }
}
