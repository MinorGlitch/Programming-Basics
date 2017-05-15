import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        boolean equal = a.equalsIgnoreCase(b);

        if (equal) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
