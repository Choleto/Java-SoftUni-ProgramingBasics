package Exercise;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());

        double boatPrice = 0;
        switch (season) {
            case "Spring":
                boatPrice = 3000;
                break;

            case "Summer":
                boatPrice = 4200;
                break;

            case "Autumn":
                boatPrice = 4200;
                break;

            case "Winter":
                boatPrice = 2600;
                break;
        }
        if (fishers <= 6) {
            boatPrice = boatPrice * 0.90;
        } else if (fishers >= 7 && fishers <= 11) {
            boatPrice = boatPrice * 0.85;
        } else {
            boatPrice = boatPrice * 0.75;
        }
        if (fishers % 2 == 0 && !season.equals("Autumn")) {
            boatPrice = boatPrice * 0.95;
        }
        double diff = Math.abs(boatPrice - budget);
        if (budget >= boatPrice) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
