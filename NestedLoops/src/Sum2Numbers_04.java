import java.util.Scanner;

public class Sum2Numbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int countSum = 0;
        int x = 0;
        int y = 0;
        boolean found = false;

        for (x = n1; x <= n2; x++) {
            for (y = n1; y <= n2; y++) {

                countSum++;
                if (x + y == magicNumber) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (x + y == magicNumber) {
            System.out.printf("Combination N:%d (%d + %d = %d)", countSum, x, y, magicNumber);
        } else {
            System.out.printf("%d combinations - neither equals %d", countSum, magicNumber);
        }
    }
}
