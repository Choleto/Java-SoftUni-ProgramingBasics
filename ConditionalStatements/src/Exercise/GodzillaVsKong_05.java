package Exercise;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double clothesPerOne = Double.parseDouble(scanner.nextLine());

        double decoration = budget * 0.10;
        double clothesPrice = clothesPerOne * statist;
        if (statist > 150) {
            clothesPrice = clothesPrice - (clothesPrice * 0.10);
        }
        double filmPrice = decoration + clothesPrice;
        double diff = Math.abs(filmPrice - budget);
        if (budget < filmPrice) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);

        }
    }
}
