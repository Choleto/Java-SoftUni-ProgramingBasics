package Exercise;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());

        String mountain = "";
        int allPeople = 0;
        int people1 = 0;
        int people2 = 0;
        int people3 = 0;
        int people4 = 0;
        int people5 = 0;

        for (int i = 1; i <= groups ; i++) {
            int people = Integer.parseInt(scanner.nextLine());

            if (people <= 5) {
                mountain = "Musala";
                people1 = people1 + people;

            } else if (people <= 12) {
                mountain = "Monblan";
                people2 = people2 + people;

            } else if (people <= 25) {
                mountain = "Kilimandjaro";
                people3 = people3 + people;

            } else if (people <= 40) {
                mountain = "K2";
                people4 = people4 + people;

            } else {
                mountain = "Everest";
                people5 = people5 + people;

            }
            allPeople = allPeople + people;
        }
        double p1 = people1 * 1.0 / allPeople * 100;
        double p2 = people2 * 1.0 / allPeople * 100;
        double p3 = people3 * 1.0 / allPeople * 100;
        double p4 = people4 * 1.0 / allPeople * 100;
        double p5 = people5 * 1.0 / allPeople * 100;

        System.out.printf("%.2f%%", p1);
        System.out.println();
        System.out.printf("%.2f%%", p2);
        System.out.println();
        System.out.printf("%.2f%%", p3);
        System.out.println();
        System.out.printf("%.2f%%", p4);
        System.out.println();
        System.out.printf("%.2f%%", p5);

    }
}
