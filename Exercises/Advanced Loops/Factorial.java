import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int factorial = 1;

        do {
            factorial *= n;
            n--;
        } while (n > 1);

        System.out.println(factorial);
    }
}
