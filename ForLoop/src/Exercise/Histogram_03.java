package Exercise;

import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        for (int i = 1; i <= n; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            if (value < 200) {
                p1++;
            } else if (value < 400) {
                p2++;
            } else if (value < 600) {
                p3++;
            } else if (value < 800) {
                p4++;
            } else {
                p5++;
            }
        }
        double sumP1 = (p1 * 1.00 / n) * 100;
        double sumP2 = (p2 * 1.00 / n) * 100;
        double sumP3 = (p3 * 1.00 / n) * 100;
        double sumP4 = (p4 * 1.00 / n) * 100;
        double sumP5 = (p5 * 1.00 / n) * 100;

        System.out.printf("%.2f%%%n", sumP1);
        System.out.printf("%.2f%%%n", sumP2);
        System.out.printf("%.2f%%%n", sumP3);
        System.out.printf("%.2f%%%n", sumP4);
        System.out.printf("%.2f%%%n", sumP5);

    }
}
