package Exercise;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int freeSpace = length * width * height;
        int sumBox = 0;
        boolean noSpace = false;
        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            int boxSpace = Integer.parseInt(command);
            sumBox = sumBox + boxSpace;
            if (sumBox > freeSpace) {
                noSpace = true;
                break;
            }
            command = scanner.nextLine();
        }
        int diff = Math.abs(sumBox - freeSpace);
        if (noSpace) {
            System.out.printf("No more free space! You need %d Cubic meters more.", diff);
        } else {
            System.out.printf("%d Cubic meters left.", diff);
        }
    }
}
