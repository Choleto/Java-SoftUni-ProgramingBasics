import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //повтарям вноските
        // докато нямам команда NoMoreMoney
        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("NoMoreMoney")) {
            double number = Double.parseDouble(input);
            number = number * 1.00;
            if (number < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f %n", number);
            sum = sum + number;
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}
