package Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);

        double result = 0;
        boolean isZero = false;
        String oddOrEven = "";

        if (operator == '+') {
            result = num1 + num2;
            if (result % 2 == 0) {
                oddOrEven = "even";
            } else {
                oddOrEven = "odd";
            }

        } else if (operator == '-') {
            result = num1 - num2;
            if (result % 2 == 0) {
                oddOrEven = "even";
            } else {
                oddOrEven = "odd";
            }

        } else if (operator == '*') {
            result = num1 * num2;
            if (result % 2 == 0) {
                oddOrEven = "even";
            } else {
                oddOrEven = "odd";
            }
        } else if (operator == '/' ) {
            if (num2 == 0) {
                isZero = true;
            } else {
                result = num1 * 1.00 / num2;
            }
        } else if (operator == '%') {
            if (num2 == 0) {
                isZero = true;
            } else {
                result = num1 % num2;
            }

        }
        if (operator == '+' || operator == '-' || operator == '*') {
            System.out.printf("%d %c %d = %.0f - %s", num1, operator, num2, result, oddOrEven);
        } else if (operator == '/') {
            if (isZero == true) {
                System.out.printf("Cannot divide %d by zero", num1);
            } else {
                System.out.printf("%d %c %d = %.2f", num1, operator, num2, result);
            }
        } else if (operator == '%') {
            if (isZero == true) {
                System.out.printf("Cannot divide %d by zero", num1);
            } else {
                System.out.printf("%d %c %d = %.0f", num1, operator, num2, result);
            }
        }

    }
}
