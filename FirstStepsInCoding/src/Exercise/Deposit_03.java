package Exercise;

import java.util.Scanner;

public class Deposit_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double increase = deposit * (percent / 100);
        double increaseMonth = increase / 12;
        double result = deposit + month * increaseMonth;
        System.out.println(result);

    }
}
