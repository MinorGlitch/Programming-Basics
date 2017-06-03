import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int spaces = n - 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(repeatStr(" ", spaces));
            System.out.println(repeatStr("* ", i));
            spaces--;
        }

        for (int i = n - 1; i >= 1; i--) {
            System.out.print(repeatStr(" ", spaces + 1));
            System.out.println(repeatStr(" *", i));
            spaces++;
        }
    }

    private static String repeatStr(String strToRepeat, int count) {
        StringBuilder character = new StringBuilder();

        for (int i = 0; i < count; i++) {
            character.append(strToRepeat);
        }
        return character.toString();
    }
}
