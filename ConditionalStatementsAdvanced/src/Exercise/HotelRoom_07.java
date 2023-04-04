package Exercise;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0;
        double priceApart = 0;
        switch (month) {
            case "May":
            case "October":
                priceStudio = 50;
                priceApart = 65;
                if (days > 7 && days <= 14) {
                    priceStudio = (priceStudio * 0.95) * days;
                    priceApart = priceApart * days;
                } else if (days > 14) {
                    priceStudio = (priceStudio * 0.70) * days;
                    priceApart = (priceApart * 0.90) * days;
                } else {
                    priceStudio = priceStudio * days;
                    priceApart = priceApart * days;
                }
                break;
            case "June":
            case "September":
                priceApart = 68.70;
                priceStudio = 75.20;
                if (days > 14) {
                    priceStudio = (priceStudio * 0.80) * days;
                    priceApart = (priceApart * 0.90) * days;
                } else {
                    priceStudio = priceStudio * days;
                    priceApart = priceApart * days;
                }
                break;
            case "July":
            case "August":
                priceStudio = 76;
                priceApart = 77;
                if (days > 14) {
                    priceStudio = priceStudio * days;
                    priceApart = (priceApart * 0.90) * days;
                } else {
                    priceStudio = priceStudio * days;
                    priceApart = priceApart * days;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.\n" +
                "Studio: %.2f lv.", priceApart, priceStudio);
    }
}
