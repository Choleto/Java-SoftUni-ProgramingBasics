package Exercise;

import java.util.Scanner;

public class ExamTime_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());
        int hourArrive = Integer.parseInt(scanner.nextLine());
        int minArrive = Integer.parseInt(scanner.nextLine());

        int examAllMin = (hourExam * 60) + minExam;
        int arriveAllMin = (hourArrive * 60) + minArrive;

        int diff = Math.abs(examAllMin - arriveAllMin);


        if (examAllMin < arriveAllMin) {
            System.out.println("Late");
            if (diff >= 60) {
                int hour = diff / 60;
                int min = diff % 60;
                System.out.printf("%d:%02d hours after the start", hour, min);
            } else {
                System.out.printf("%d minutes after the start", diff);
            }

        } else if (examAllMin == arriveAllMin || diff <= 30) {
            System.out.println("On time");
            if (diff >= 1 && diff <= 30) {
                System.out.printf("%d minutes before the start", diff);
            }
        } else {
            System.out.println("Early");
            if (diff >= 60) {
                int hour = diff / 60;
                int min = diff % 60;
                System.out.printf("%d:%02d hours before the start", hour, min);
            } else {
                System.out.printf("%d minutes before the start", diff);
            }
        }
    }
}
