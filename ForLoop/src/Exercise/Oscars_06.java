package Exercise;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actor = scanner.nextLine();
        double startPoints = Double.parseDouble(scanner.nextLine());
        int judge = Integer.parseInt(scanner.nextLine());

        double allPoints = 0;
        double sumPoints = startPoints;
        for (int i = 1; i <= judge; i++) {
            String nameJudge = scanner.nextLine();
            double givenPoints = Double.parseDouble(scanner.nextLine());

            sumPoints = sumPoints + ((nameJudge.length() * givenPoints) / 2);
            allPoints = sumPoints;
            if (allPoints > 1250.5) {
                break;
            }

        }
        double diff = Math.abs(1250.5 - allPoints);
        if (allPoints > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, sumPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actor, diff);
        }
    }
}
