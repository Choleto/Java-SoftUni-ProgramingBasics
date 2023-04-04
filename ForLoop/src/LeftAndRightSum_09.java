import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;

        for (int count = 1; count <= number; count++) {
            int firstNum = Integer.parseInt(scanner.nextLine());
            sum1 += firstNum;
        }
        for (int count = 1; count <= number; count++) {
            int secondNum = Integer.parseInt(scanner.nextLine());
            sum2 += secondNum;
        }
        if (sum1 == sum2) {
            System.out.printf("Yes, sum = %d", sum1);
        } else {
            int diff = Math.abs(sum1 - sum2);
            System.out.printf("No, diff = %d", diff);
        }
    }
}
