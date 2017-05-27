import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int max = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            sum += number;

            if (number > max) {
                max = number;
            }
        }
        sum -= max;
        if (max == sum) {
            System.out.println("Yes, sum = " + sum);
        } else {
            System.out.println("No, diff = " + Math.abs(sum - max));
        }
    }
}
