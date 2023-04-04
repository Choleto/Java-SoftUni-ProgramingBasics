package Exercise;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String series = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunch = breakTime / 8.0;
        double relax = breakTime / 4.0;
        double timeForEpisode =  breakTime - (lunch + relax);
        double diff = Math.abs(timeForEpisode - episodeTime);
        if (timeForEpisode >= episodeTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", series, Math.ceil(diff));

        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", series, Math.ceil(diff));
        }
    }
}
