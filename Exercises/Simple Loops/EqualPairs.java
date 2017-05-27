import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int previousSum = 0;
        int maxDiff = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int firstNumber = Integer.parseInt(scanner.nextLine());
            int secondNumber = Integer.parseInt(scanner.nextLine());

            int sum = firstNumber + secondNumber;
            if (i != 0) {
                if (previousSum != sum) {
                    int diff = Math.abs(previousSum - sum);
                    if (diff > maxDiff) {
                        maxDiff = diff;
                    }
                }
            }
            previousSum = sum;
        }
        if (maxDiff == Integer.MIN_VALUE) {
            System.out.println("Yes, value=" + previousSum);
        } else {
            System.out.println("No, maxdiff=" + maxDiff);
        }
    }
}
