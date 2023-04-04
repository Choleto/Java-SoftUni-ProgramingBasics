package Exercise;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylonQ = Integer.parseInt(scanner.nextLine());
        int paintQ = Integer.parseInt(scanner.nextLine());
        int razrQ = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        //Предпазен найлон - 1.50 лв. за кв. метър
        //Боя - 14.50 лв. за литър
        //Разредител за боя - 5.00 лв. за литър
        double nylonPrice = (nylonQ + 2) * 1.50;
        double paintPrice = (paintQ * 1.10) * 14.50;
        double razrPrice = razrQ * 5;
        double allPrices = nylonPrice + paintPrice + razrPrice + 0.40;
        double working = (allPrices * 0.30) * hours;
        double result = allPrices + working;
        System.out.println(result);
    }
}
