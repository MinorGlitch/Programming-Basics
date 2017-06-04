import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftRight = (n - 2) / 2;
        int topHeight = n / 2;
        int middleDashes = 0;


        if (n <= 2) {
            System.out.println(repeatStr("*", n));
        } else {

            if (n % 2 != 0) {
                System.out.print(repeatStr("-", (n - 1) / 2));
                System.out.println("*" + repeatStr("-", (n - 1) / 2));
                middleDashes = 1;
            }

            for (int i = 0; i < topHeight; i++) {

                System.out.print(repeatStr("-", leftRight) + "*");
                System.out.println(repeatStr("-", middleDashes) + "*" + repeatStr("-", leftRight));

                middleDashes += 2;
                leftRight--;
            }

            middleDashes -= 4;
            leftRight += 2;

            for (int i = topHeight - 1; i > 0; i--) {
                System.out.print(repeatStr("-", leftRight) + "*");
                System.out.println(repeatStr("-", middleDashes) + "*" + repeatStr("-", leftRight));

                middleDashes -= 2;
                leftRight++;
            }

            if (n % 2 != 0) {
                System.out.print(repeatStr("-", (n - 1) / 2));
                System.out.println("*" + repeatStr("-", (n - 1) / 2));
            }
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
