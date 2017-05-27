import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());

        boolean inRange = num >= 100 && num <= 200;

        if (!(inRange || num == 0)) {
            System.out.println("invalid");
        }
    }
}