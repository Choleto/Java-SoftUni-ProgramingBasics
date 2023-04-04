import java.util.Scanner;

public class Sequence_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int input = 1;
        while (input <= number) {
            System.out.println(input);
            input = (input * 2) + 1;
        }
    }
}
