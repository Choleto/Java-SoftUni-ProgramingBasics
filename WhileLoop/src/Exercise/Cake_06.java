package Exercise;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        boolean noLeft = false;
        int sum = length * width;
        String command = scanner.nextLine();
        while (!command.equals("STOP")) {
            int takes = Integer.parseInt(command);
            sum = sum - takes;

            if (sum <= 0) {
                noLeft = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (noLeft) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(sum));
        } else  {
            System.out.printf("%d pieces are left.", sum);
        }
    }
}
