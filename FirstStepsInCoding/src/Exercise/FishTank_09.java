package Exercise;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        double volume = length * width * height;
        double volumeInLitres = volume / 1000;
        double space = percent / 100;
        double neededLitres = volumeInLitres * (1 - space);
        System.out.println(neededLitres);
    }
}
