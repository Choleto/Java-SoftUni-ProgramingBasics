import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int countClasses = 0;
        int countLowGrades = 0;
        double sum = 0;

        while (countClasses != 12) {
            double grades = Double.parseDouble(scanner.nextLine());

            if (grades < 4) {
                countLowGrades++;
            } if (countLowGrades > 1) {
                break;
            }
            countClasses++;
            sum += grades;

        }
        if (countClasses == 12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, countClasses);
        }

    }
}
