import java.util.Scanner;

public class PowFor2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int pow = 0; pow <= n; pow += 2) {
            if (pow % 2 == 0) {
                System.out.println(Math.pow(2, pow));
            }
        }
    }
}
