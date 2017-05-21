import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfYear = scanner.nextLine();

        int p = Integer.parseInt(scanner.nextLine());

        // Holidays in a year.

        int h = Integer.parseInt(scanner.nextLine());

        // Weekends, Vladi is travelling to his home town.

        double weekendsInSofia = 48 - h;

        double gamesInSofia = weekendsInSofia * 3.0 / 4;

        // Games in home town = h.

        double holidayGames = p * 2.0 / 3;

        double allGames = gamesInSofia + holidayGames + h;

        double leapResult = 0.0;

        if (typeOfYear.equals("leap")) {
            leapResult = allGames + allGames * 0.15;
            System.out.println(Math.floor(leapResult));
        } else {
            System.out.println(Math.floor(allGames));
        }
    }
}
