package Exercise;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double holiday = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int bear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());

        int allToys = puzzle + doll + bear + minion + truck;

        //Пъзел - 2.60 лв.
        //Говореща кукла - 3 лв.
        //Плюшено мече - 4.10 лв.
        //Миньон - 8.20 лв.
        //Камионче - 2 лв.
        double sum = (puzzle * 2.60) + (doll * 3.00) + (bear * 4.10) + (minion * 8.20) + (truck * 2.00);
        double discount = 0;
        if (allToys >= 50) {
            discount = sum * 0.25;
        }
        double win = sum - discount;
        double payment = win * 0.10;
        double leftMoney = win - payment;
        double diff = Math.abs(leftMoney - holiday);

        if (leftMoney >= holiday) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }

    }
}
