package Exercise;

import java.util.Scanner;

public class SwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double metres = Double.parseDouble(scanner.nextLine());
        double secPerMetre = Double.parseDouble(scanner.nextLine());

        double timeSwim = metres * secPerMetre;
        double resistance = Math.floor(metres / 15) * 12.5;
        double totalTime = timeSwim + resistance;
        double diff = Math.abs(totalTime - worldRecord);

        if (totalTime < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);
        }
        else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff );
        }
    }
}
