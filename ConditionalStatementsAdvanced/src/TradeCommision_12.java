import java.util.Scanner;

public class TradeCommision_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());

        if ("Sofia".equals(city)) {
            if (sells >= 0 && sells <= 500) {
                double sum = sells * 0.05;
                System.out.printf("%.2f", sum);
            } else if (sells > 500 && sells <= 1000) {
                double sum = sells * 0.07;
                System.out.printf("%.2f", sum);
            } else if (sells > 1000 && sells <= 10000) {
                double sum = sells * 0.08;
                System.out.printf("%.2f", sum);
            } else if (sells > 10000) {
                double sum = sells * 0.12;
                System.out.printf("%.2f", sum);
            } else {
                System.out.println("error");
            }

        }
        else if ("Varna".equals(city)) {
            if (sells >= 0 && sells <= 500) {
                double sum = sells * 0.045;
                System.out.printf("%.2f", sum);
            } else if (sells > 500 && sells <= 1000) {
                double sum = sells * 0.075;
                System.out.printf("%.2f", sum);
            } else if (sells > 1000 && sells <= 10000) {
                double sum = sells * 0.1;
                System.out.printf("%.2f", sum);
            } else if (sells > 10000) {
                double sum = sells * 0.13;
                System.out.printf("%.2f", sum);
            } else {
                System.out.println("error");
            }

        } else if ("Plovdiv".equals(city)) {
            if (sells >= 0 && sells <= 500) {
                double sum = sells * 0.055;
                System.out.printf("%.2f", sum);
            } else if (sells > 500 && sells <= 1000) {
                double sum = sells * 0.08;
                System.out.printf("%.2f", sum);
            } else if (sells > 1000 && sells <= 10000) {
                double sum = sells * 0.12;
                System.out.printf("%.2f", sum);
            } else if (sells > 10000) {
                double sum = sells * 0.145;
                System.out.printf("%.2f", sum);
            } else {
                System.out.println("error");
            }
        }
        else {
            System.out.println("error");
        }
    }
}
