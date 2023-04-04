import java.util.Scanner;

public class CharacterSequance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        for (int pos = 0; pos <= text.length() - 1; pos++) {
            char symbol = text.charAt(pos);
            System.out.println(symbol);

        }
    }
}
