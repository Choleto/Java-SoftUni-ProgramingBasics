package Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        int countSpend = 0;
        int countAllDays = 0;
        double sumMoney = currentMoney;

        String command = scanner.nextLine();
        while (sumMoney < neededMoney) {
            String action = command;
            double money = Double.parseDouble(scanner.nextLine());

            if ("save".equals(action)) {
                countSpend = 0;
                sumMoney = sumMoney + money;
            } else if ("spend".equals(action)) {
                countSpend++;
                sumMoney = sumMoney - money;
                if (sumMoney <= 0) {
                    sumMoney = 0;
                }
            }
            countAllDays++;
            if (sumMoney >= neededMoney) {
                break;
            }
            if (countSpend >= 5) {
                break;
            }
            command = scanner.nextLine();
        }
        if (countSpend == 5) {
            System.out.println("You can't save the money.");
            System.out.println(countAllDays);
        } else if (sumMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", countAllDays);
        }
    }
}
