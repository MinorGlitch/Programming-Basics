import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        boolean greater = a >= b;

        if (greater) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
