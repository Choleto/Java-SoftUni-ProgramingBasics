package Exercise;

import java.util.Scanner;

public class Time15Minutes_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allMin = (hours * 60) + minutes + 15;
        int hour = allMin / 60;
        int minute = allMin % 60;
        if (hour > 23) {
            hour = 0;
        }

        System.out.printf("%d:%02d", hour, minute);

    }
}
