package Exercise;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String typeHoliday = "";
        double taxes = 0;
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                taxes = budget * 0.30;
                typeHoliday = "Camp";
            } else {
                taxes = budget * 0.70;
                typeHoliday = "Hotel";
            }
        } else if (budget <= 1000) {

            destination = "Balkans";
            if (season.equals("summer")) {
                taxes = budget * 0.40;
                typeHoliday = "Camp";
            } else {
                taxes = budget * 0.80;
                typeHoliday = "Hotel";
            }
        } else if (budget > 1000) {
            destination = "Europe";
            taxes = budget * 0.90;
            typeHoliday = "Hotel";
        }

        System.out.printf("Somewhere in %s %n" +
                "%s - %.2f", destination, typeHoliday, taxes);

    }
}
