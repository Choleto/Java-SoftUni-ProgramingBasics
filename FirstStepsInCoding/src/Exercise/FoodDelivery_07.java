package Exercise;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());
        //Пилешко меню – 10.35 лв.
        //Меню с риба – 12.40 лв.
        //Вегетарианско меню – 8.15 лв.
        double chickenPrice = chickenMenu * 10.35;
        double fishPrice = fishMenu * 12.40;
        double veganPrice = veganMenu * 8.15;
        double allPrice = chickenPrice + fishPrice + veganPrice;
        double desert = allPrice * 0.20;
        double result = allPrice + desert + 2.50;
        System.out.println(result);

    }
}
