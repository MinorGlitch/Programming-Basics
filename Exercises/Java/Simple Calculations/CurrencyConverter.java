import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Alex on 29.4.2017 г..
 */
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat round = new DecimalFormat("#0.00");

        double money = Double.parseDouble(scanner.nextLine());
        String inputValue = scanner.nextLine();
        String outputValue = scanner.nextLine();

        double dollarRate = 1.79549;
        double euroRate = 1.95583;
        double poundRate = 2.53405;

        if (inputValue.equalsIgnoreCase("BGN")) {
        } else if (outputValue.equalsIgnoreCase("USD")) {
            double result = money / dollarRate;
            System.out.println(round.format(result));
        } else if (outputValue.equalsIgnoreCase("EUR")) {
            double result = money / euroRate;
            System.out.println(round.format(result));
        } else if (outputValue.equalsIgnoreCase("GBP")) {
            double result = money / poundRate;
            System.out.println(round.format(result));
        }
        if (inputValue.equalsIgnoreCase("USD")) {
        } else if (outputValue.equalsIgnoreCase("BGN")) {
            double result = money * dollarRate;
            System.out.println(round.format(result));
        } else if (outputValue.equalsIgnoreCase("EUR")) {
            double result = (money * dollarRate) / euroRate;
            System.out.println(round.format(result));
        } else if (outputValue.equalsIgnoreCase("GBP")) {
            double result = (money * dollarRate) / poundRate;
            System.out.println(round.format(result));
        } else if (inputValue.equalsIgnoreCase("EUR")) {
        } else if (outputValue.equalsIgnoreCase("BGN")) {
            double result = money * euroRate;
            System.out.println(round.format(result));
        } else if (outputValue.equalsIgnoreCase("USD")) {
            double result = (money * euroRate) / dollarRate;
            System.out.println(round.format(result));
        } else if (outputValue.equalsIgnoreCase("GBP")) {
            double result = (money * euroRate) / poundRate;
            System.out.println(round.format(result));
        }
        if (inputValue.equalsIgnoreCase("GBP")) {
        } else if (outputValue.equalsIgnoreCase("BGN")) {
            double result = money * poundRate;
            System.out.println(round.format(result));
        } else if (outputValue.equalsIgnoreCase("USD")) {
            double result = (money * poundRate) / dollarRate;
            System.out.println(round.format(result));
        } else if (outputValue.equalsIgnoreCase("EUR")) {
            double result = (money * poundRate) / euroRate;
            System.out.println(round.format(result));
        }
    }
}
}
