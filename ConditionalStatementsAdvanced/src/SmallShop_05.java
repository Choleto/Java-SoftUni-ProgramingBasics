import java.util.Scanner;

public class SmallShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        switch (product) {
            case "coffee":
                if (city.equals("Sofia")) {
                    double priceCoffee = 0.50;
                    double price = priceCoffee * quantity;
                    System.out.println(price);
                }
                else if (city.equals("Plovdiv")) {
                    double priceCoffee = 0.40;
                    double price = priceCoffee * quantity;
                    System.out.println(price);
                }
                else if (city.equals("Varna")) {
                    double priceCoffee = 0.45;
                    double price = priceCoffee * quantity;
                    System.out.println(price);
                }
                break;
            case "water":
                if (city.equals("Sofia")) {
                    double priceWater = 0.80;
                    double price = priceWater * quantity;
                    System.out.println(price);
                }
                else if (city.equals("Plovdiv")) {
                    double priceWater = 0.70;
                    double price = priceWater * quantity;
                    System.out.println(price);
                }
                else if (city.equals("Varna")) {
                    double priceWater = 0.70;
                    double price = priceWater * quantity;
                    System.out.println(price);
                }
                break;

            case "beer":
                if (city.equals("Sofia")) {
                    double priceBeer = 1.20;
                    double price = priceBeer * quantity;
                    System.out.println(price);
                }
                else if (city.equals("Plovdiv")) {
                    double priceBeer = 1.15;
                    double price = priceBeer * quantity;
                    System.out.println(price);
                }
                else if (city.equals("Varna")) {
                    double priceBeer = 1.10;
                    double price = priceBeer * quantity;
                    System.out.println(price);
                }
                break;

            case "sweets":
                if (city.equals("Sofia")) {
                    double priceSweets = 1.45;
                    double price = priceSweets * quantity;
                    System.out.println(price);
                }
                else if (city.equals("Plovdiv")) {
                    double priceSweets = 1.30;
                    double price = priceSweets * quantity;
                    System.out.println(price);
                }
                else if (city.equals("Varna")) {
                    double priceSweets = 1.35;
                    double price = priceSweets * quantity;
                    System.out.println(price);
                }
                break;
            case "peanuts":
                if (city.equals("Sofia")) {
                    double pricePeanuts = 1.60;
                    double price = pricePeanuts * quantity;
                    System.out.println(price);
                }
                else if (city.equals("Plovdiv")) {
                    double pricePeanuts = 1.50;
                    double price = pricePeanuts * quantity;
                    System.out.println(price);
                }
                else if (city.equals("Varna")) {
                    double pricePeanuts = 1.55;
                    double price = pricePeanuts * quantity;
                    System.out.println(price);
                }
                break;
        }

    }
}
