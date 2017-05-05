import java.util.Scanner;

/**
 * Created by Alex on 22.4.2017 г..
 */
public class SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

       // for (int i = 0; i <n; i++) {
            System.out.println(repeatString("*",n));
        for (int i = 0; i <n - 2; i++) {
            System.out.println("*" + repeatString(" ", n - 2) + "*");
        }

            System.out.print( repeatString("*",n));

      //  }
    }
    private static String repeatString (String repeat, int count) {
        String sign = "";
        for (int i = 0; i <count; i++) {
            sign = sign + repeat;
        }
        return sign;
    }
}
