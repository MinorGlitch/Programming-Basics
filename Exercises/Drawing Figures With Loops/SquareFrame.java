import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // Top part.

        System.out.println("+ " + repeatStr("- ", n - 2) + "+");

        // Middle part.

        for (int i = 0; i < n - 2; i++) {
            System.out.println("| " + repeatStr("- ", n - 2) + "|");
        }

        // Bottom part.

        System.out.println("+ " + repeatStr("- ", n - 2) + "+");

    }

    private static String repeatStr(String strToRepeat, int count) {
        StringBuilder character = new StringBuilder();

        for (int i = 0; i < count; i++) {
            character.append(strToRepeat);
        }
        return character.toString();
    }
}
