import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dollars = Double.parseDouble(scanner.nextLine());

        double rate = 1.79549;

        double leva = dollars * rate;

        System.out.printf("%.2f", leva);
    }
}
