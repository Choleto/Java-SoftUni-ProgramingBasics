package Exercise;

import java.util.Scanner;

public class ExamPreparations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int failedGrades = Integer.parseInt(scanner.nextLine());

        double sumGrades = 0;
        int countFails = 0;
        int countGrades = 0;
        String lastProblem = "";
        boolean isFailed = true;
        String command = scanner.nextLine();
        while (!command.equals("Enough")) {

            String currentProblem = command;
            int currentGrade = Integer.parseInt(scanner.nextLine());

            if (currentGrade <= 4) {
                countFails++;
            }
            if (countFails >= failedGrades) {
                break;
            }
            sumGrades += currentGrade;
            countGrades++;
            lastProblem = currentProblem;
            command = scanner.nextLine();
        }
        if (countFails >= failedGrades) {
            System.out.printf("You need a break, %d poor grades.", countFails);
        } else {
            System.out.printf("Average score: %.2f%n", sumGrades / countGrades);
            System.out.printf("Number of problems: %d%n", countGrades);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
