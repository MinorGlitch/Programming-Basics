import java.util.Scanner;


public class UnitsConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine().toLowerCase();
        String output = scanner.nextLine().toLowerCase();

        switch (input) {
            case "mm":
                a = a / 1000;
                break;
            case "cm":
                a = a / 100;
                break;
            case "mi":
                a = a / 0.000621371192;
                break;
            case "in":
                a = a / 39.3700787;
                break;
            case "km":
                a = a / 0.001;
                break;
            case "ft":
                a = a / 3.2808399;
                break;
            case "yd":
                a = a / 1.0936133;
                break;
        }

        switch (output) {
            case "mm":
                a = a * 1000;
                break;
            case "cm":
                a = a * 100;
                break;
            case "mi":
                a = a * 0.000621371192;
                break;
            case "in":
                a = a * 39.3700787;
                break;
            case "km":
                a = a * 0.001;
                break;
            case "ft":
                a = a * 3.2808399;
                break;
            case "yd":
                a = a * 1.0936133;
                break;
        }

        System.out.println(a);

    }
}

