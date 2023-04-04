package Exercise;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Видеокарта – 250 лв./бр.
        // Процесор – 35% от цената на закупените видеокарти/бр.
        // Рам памет – 10% от цената на закупените видеокарти/бр.
        double budget = Double.parseDouble(scanner.nextLine());
        int gpu = Integer.parseInt(scanner.nextLine());
        int core = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double gpuPrice = gpu * 250;

        double corePrice = gpuPrice * 0.35;
        double boughtCore = corePrice * core;

        double ramPrice = gpuPrice * 0.10;
        double boughtRam = ramPrice * ram;

        double totalPrice = gpuPrice + boughtCore + boughtRam;

        double discount = 0;
        if (core < gpu) {
            discount = totalPrice * 0.15;
        }
        double priceWithDiscount = totalPrice - discount;
        double diff = Math.abs(budget - priceWithDiscount);

        if (budget < priceWithDiscount) {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        } else {
            System.out.printf("You have %.2f leva left!", diff);
        }

    }
}
