import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int baseHeight = n / 2;
        int roofHeight = n - baseHeight;
        int stars = 1;

        if (n % 2 == 0) {
            stars = 2;
        }

        for (int i = 1; i <= roofHeight; i++) {
            System.out.print(repeatStr("-", (n - stars) / 2));
            System.out.print(repeatStr("*", stars));
            System.out.println(repeatStr("-", (n - stars) / 2));

            stars += 2;
        }

        for (int i = 0; i < baseHeight; i++) {
            System.out.println("|" + repeatStr("*", n - 2) + "|");
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
