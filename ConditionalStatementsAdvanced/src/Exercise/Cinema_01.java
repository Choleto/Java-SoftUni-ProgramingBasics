package Exercise;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int column = Integer.parseInt(scanner.nextLine());
        int row = Integer.parseInt(scanner.nextLine());

        // Premiere - 12 lv
        // Normal - 7.50 lv
        // Discount - 5 lv
        int allSeats = column * row;
        double price = 0;

        switch (type) {
            case "Premiere":
                price = 12;
                double fullPrice = allSeats * price;
                System.out.printf("%.2f leva", fullPrice);
                break;

            case "Normal":
                price = 7.50;
                double normalPrice = allSeats * price;
                System.out.printf("%.2f leva", normalPrice);
                break;

            case "Discount":
                price = 5;
                double discountPrice = allSeats * price;
                System.out.printf("%.2f leva", discountPrice );
                break;
        }
    }
}
