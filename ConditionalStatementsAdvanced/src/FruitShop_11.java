import java.util.Scanner;

public class FruitShop_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if ("Monday".equals(day) || "Tuesday".equals(day) || "Wednesday".equals(day) || "Thursday".equals(day) || "Friday".equals(day)) {
            if (fruit.equals("banana")) {
                double banana = 2.50;
                double price = banana * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("apple")) {
                double apple = 1.20;
                double price = apple * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("orange")) {
                double orange = 0.85;
                double price = orange * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("grapefruit")) {
                double grape = 1.45;
                double price = grape * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("kiwi")) {
                double kiwi = 2.70;
                double price = kiwi * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("pineapple")) {
                double pine = 5.50;
                double price = pine * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("grapes")) {
                double grapes = 3.85;
                double price = grapes * quantity;
                System.out.printf("%.2f", price);
            }
            else {
                System.out.println("error");
            }
        } else if ("Saturday".equals(day) || "Sunday".equals(day)) {
            if (fruit.equals("banana")) {
                double banana = 2.70;
                double price = banana * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("apple")) {
                double apple = 1.25;
                double price = apple * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("orange")) {
                double orange = 0.90;
                double price = orange * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("grapefruit")) {
                double grape = 1.60;
                double price = grape * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("kiwi")) {
                double kiwi = 3.00;
                double price = kiwi * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("pineapple")) {
                double pine = 5.60;
                double price = pine * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("grapes")) {
                double grapes = 4.20;
                double price = grapes * quantity;
                System.out.printf("%.2f", price);
            } else {
                System.out.println("error");
            }

        }
        else {
            System.out.println("error");
        }
    }
}
