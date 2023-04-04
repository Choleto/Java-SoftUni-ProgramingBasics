package Exercise;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearTax = Integer.parseInt(scanner.nextLine());
        double shoes = yearTax * 0.60;
        double equip = shoes * 0.80;
        double ball = equip * 0.25;
        double access = ball * 0.20;
        double allTaxes = shoes + equip + ball + access + yearTax;
        System.out.println(allTaxes);
    }
}
