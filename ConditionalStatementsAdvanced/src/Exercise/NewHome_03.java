package Exercise;

import java.util.Scanner;

public class NewHome_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());


        double fullPrice = 0;
        switch (type) {
            case "Roses": {
                fullPrice = number * 5;
                if (number > 80) {
                    fullPrice = fullPrice * 0.90;
                }

                break;
            }
            case "Dahlias": {
                fullPrice = number * 3.80;
                if (number > 90) {
                    fullPrice = fullPrice * 0.85;
                }

                break;
            }
            case "Tulips": {
                fullPrice = number * 2.80;
                if (number > 80) {
                    fullPrice = fullPrice * 0.85;

                }

                break;
            }
            case "Narcissus": {
                fullPrice = number * 3;
                if (number < 120) {
                    fullPrice = fullPrice * 1.15;
                }

                break;
            }
            case "Gladiolus": {
                fullPrice = number * 2.50;
                if (number < 80) {
                    fullPrice = fullPrice * 1.20;
                }

                break;
            }
        }
        double diff = Math.abs(fullPrice - budget);
        if (budget >= fullPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, type, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}
