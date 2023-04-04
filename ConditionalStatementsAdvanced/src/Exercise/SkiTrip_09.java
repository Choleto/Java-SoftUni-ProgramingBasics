package Exercise;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String grade = scanner.nextLine();

        //room for one person – 18.00 лв за нощувка
        //apartment – 25.00 лв за нощувка
        //president apartment – 35.00 лв за нощувка
        double price = 0;
        int nights = days - 1;
        switch (room) {
            case "room for one person":
                price = 18 * nights;
                if (grade.equals("positive")) {
                    price = price * 1.25;
                } else {
                    price = price * 0.90;
                }
                break;

            case "apartment":
                if (days < 10) {
                    price = (25 * nights) * 0.70;
                } else if (days >= 10 && days <= 15) {
                    price = (25 * nights) * 0.65;
                } else {
                    price = (25 * nights) * 0.50;
                }
                if (grade.equals("positive")) {
                    price = price * 1.25;
                } else {
                    price = price * 0.90;
                }
                break;

            case "president apartment":
                if (days < 10) {
                    price = (35 * nights) * 0.90;
                } else if (days >= 10 && days <= 15) {
                    price = (35 * nights) * 0.85;
                } else {
                    price = (35 * nights) * 0.80;
                }
                if (grade.equals("positive")) {
                    price = price * 1.25;
                } else {
                    price = price * 0.90;
                }
                break;
        }
        System.out.printf("%.2f", price);
    }
}
