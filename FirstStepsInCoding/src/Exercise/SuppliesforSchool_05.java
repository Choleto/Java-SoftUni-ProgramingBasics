package Exercise;

import java.util.Scanner;

public class SuppliesforSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int marker = Integer.parseInt(scanner.nextLine());
        int litres = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double penPrice = 5.80;
        double markerPrice = 7.20;
        double litresPrice = 1.20;
        double allPen = pens * penPrice;
        double allMarker = marker * markerPrice;
        double allLitres = litres * litresPrice;
        double allPrice = allPen + allMarker + allLitres;
        double finalPrice = allPrice - (allPrice * (discount / 100.0));
        System.out.println(finalPrice);
    }
}
