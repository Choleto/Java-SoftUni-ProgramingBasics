package Exercise;

import java.util.Scanner;

public class ConvertorRadian_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rad = Double.parseDouble(scanner.nextLine());
        double degrees = rad * 180 / Math.PI;
        System.out.println(degrees);
    }
}


