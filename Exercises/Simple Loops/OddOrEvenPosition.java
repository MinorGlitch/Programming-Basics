import java.text.DecimalFormat;
import java.util.Scanner;

public class OddOrEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat trim = new DecimalFormat("#.##");

        int n = Integer.parseInt(scanner.nextLine());

        double odd = 0;
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;
        double even = 0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;

        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                even += number;
                if (number < evenMin) {
                    evenMin = number;
                }
                if (number > evenMax) {
                    evenMax = number;
                }
            }
            if (i % 2 != 0) {
                odd += number;
                if (number < oddMin) {
                    oddMin = number;
                }
                if (number > oddMax) {
                    oddMax = number;
                }
            }
        }

        if (n == 0) {
            System.out.println("OddSum=" + trim.format(odd));
            System.out.println("OddMin=" + "No");
            System.out.println("OddMax=" + "No");
            System.out.println("EvenSum=" + trim.format(even));
            System.out.println("EvenMin=" + "No");
            System.out.println("EvenMax=" + "No");
        } else if (evenMin == 1000000000.0 || evenMax == -1000000000.0) {
            System.out.println("OddSum=" + trim.format(odd));
            System.out.println("OddMin=" + trim.format(oddMin));
            System.out.println("OddMax=" + trim.format(oddMax));
            System.out.println("EvenSum=" + trim.format(even));
            System.out.println("EvenMin=" + "No");
            System.out.println("EvenMax=" + "No");
        } else {
            System.out.println("OddSum=" + trim.format(odd));
            System.out.println("OddMin=" + trim.format(oddMin));
            System.out.println("OddMax=" + trim.format(oddMax));
            System.out.println("EvenSum=" + trim.format(even));
            System.out.println("EvenMin=" + trim.format(evenMin));
            System.out.println("EvenMax=" + trim.format(evenMax));
        }
    }
}
