import java.util.Scanner;

public class ProjectsCreation_07 {
    public class HoursForProject {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String names = scanner.nextLine();
            int projects = Integer.parseInt(scanner.nextLine());
            int hour = projects * 3;
            String job = "The architect " + names + " will need " + hour + " hours to complete " + projects + " project/s.";
            System.out.println(job);


        }
    }
}
