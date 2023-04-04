package Exercise;

import java.util.Scanner;

public class BonusScore_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = Integer.parseInt(scanner.nextLine());

        double bonus = 0;
        if (score <= 100) {
            bonus = 5;
        } else if (score <= 1000) {
            bonus = score * 0.20;
        } else if (score > 1000) {
            bonus = score * 0.10;
        }
        if (score % 2 == 0 ) {
            bonus = bonus + 1;
        }
        if (score % 10 == 5) {
            bonus = bonus + 2;
        }
        double totalScore = score + bonus;
        System.out.printf("%.1f%n", bonus);
        System.out.printf("%.1f", totalScore);
    }
}
