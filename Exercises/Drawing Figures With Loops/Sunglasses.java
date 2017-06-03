import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // Top part.

        System.out.print(repeatStr("*", 2 * n));
        System.out.print(repeatStr(" ", n));
        System.out.println(repeatStr("*", 2 * n));

        // Middle part.

        for (int i = 1; i <= n - 2; i++) {

            String leftAndRightSide = "*" + repeatStr("/", n * 2 - 2) + "*";
            String spaces = repeatStr(" ", n);

            boolean pipes = i == (n - 1) / 2;

            if (pipes) {
                spaces = repeatStr("|", n);
            } else {
                spaces = repeatStr(" ", n);
            }
            System.out.println(leftAndRightSide + spaces + leftAndRightSide);
        }

        // Bottom part.

        System.out.print(repeatStr("*", 2 * n));
        System.out.print(repeatStr(" ", n));
        System.out.println(repeatStr("*", 2 * n));
    }

    private static String repeatStr(String strToRepeat, int count) {
        StringBuilder character = new StringBuilder();

        for (int i = 0; i < count; i++) {
            character.append(strToRepeat);
        }
        return character.toString();
    }
}
