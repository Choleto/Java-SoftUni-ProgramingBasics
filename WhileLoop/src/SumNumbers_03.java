import java.util.Scanner;

public class SumNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        //повтарям n числа
        //спирам когато сумата им не стане по голяма или
        //равна на първото

        int n = 0;
        int sum = 0;

        while (sum < number) {
            n = Integer.parseInt(scanner.nextLine());
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
