import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        boolean excellent = grade <= 6 && grade >= 5.5;

        if (excellent ) {

            System.out.println("Excellent!");

        }
    }
}
