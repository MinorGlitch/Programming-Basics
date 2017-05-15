import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double points = 0;

        boolean firstCheck = number <= 100; // 5%
        boolean secondCheck = number > 100 && number <= 1000; // 20%
        boolean thirdCheck = number > 1000; // 10%

        boolean even = number % 2 == 0;
        boolean endsOn5 = number % 5 == 0;


        if (firstCheck) {
            points = 5;
        } else if (secondCheck) {
            points += number * 0.2;
        } else if (thirdCheck) {
            points += number * 0.1;
        }

        if (even) {
            points += 1;
        } else if (endsOn5) {
            points += 2;
        }

        double result = points + number;

        System.out.println(points);
        System.out.println(result);
    }
}
