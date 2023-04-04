import java.util.Scanner;

public class NumberSequence_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int number = 1; number <= n; number++ ) {
            int value = Integer.parseInt(scanner.nextLine());
            if (value > max) {
                max = value;
            } if (value < min) {
                min = value;
            }
        }
        System.out.printf("Max number: %d %nMin number: %d", max, min);

    }
}
