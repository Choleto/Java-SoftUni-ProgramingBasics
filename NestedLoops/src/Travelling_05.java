import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = "";
        double budget = 0;
        double sumSavings = 0;
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            destination = command;
            budget = Double.parseDouble(scanner.nextLine());
            while (command.equals(destination)) {
                double savings = Double.parseDouble(scanner.nextLine());
                sumSavings = sumSavings + savings;
                if (sumSavings >= budget) {
                    System.out.printf("Going to %s!%n", destination);
                    sumSavings = 0;
                    break;
                }
            }
            command = scanner.nextLine();
        }
    }
}
