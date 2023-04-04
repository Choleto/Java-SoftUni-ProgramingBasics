package Exercise;

import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int num = 1; num <= n; num++) {
            int value = Integer.parseInt(scanner.nextLine());
            sum += value;
            if (value > max) {
                max = value;
            }

        }
        int sumWithoutMax = sum - max;
        int diff = Math.abs(max - sumWithoutMax);
        if (max == sumWithoutMax) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", max);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }


    }
}
