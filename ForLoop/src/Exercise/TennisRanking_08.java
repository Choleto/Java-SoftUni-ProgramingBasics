package Exercise;

import java.util.Scanner;

public class TennisRanking_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int allPoints = 0;
        int countWins = 0;
        for (int i = 1; i <= tournaments ; i++) {
            String finish = scanner.nextLine();

            switch (finish) {
                case "W":
                    allPoints = allPoints +   2000;
                    countWins++;
                    break;
                case "F":
                    allPoints = allPoints +  1200;
                    break;
                case "SF":
                    allPoints = allPoints +  720;
                    break;
            }
        }
        System.out.printf("Final points: %d", allPoints + startingPoints);
        System.out.println();
        System.out.printf("Average points: %d",allPoints / tournaments);
        System.out.println();
        System.out.printf("%.2f%%",countWins * 1.0 / tournaments * 100);
    }
}
