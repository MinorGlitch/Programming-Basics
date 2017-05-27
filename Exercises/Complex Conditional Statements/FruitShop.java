import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();

        String day = scanner.nextLine();

        Double quantity = Double.parseDouble(scanner.nextLine());

        double result = 0.0;

        boolean week = day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
                || day.equals("Thursday") || day.equals("Friday");

        boolean weekend = day.equals("Saturday") || day.equals("Sunday");

        if (week) {
            switch (fruit) {
                case "banana":
                    result = quantity * 2.5;
                    break;
                case "apple":
                    result = quantity * 1.2;
                    break;
                case "orange":
                    result = quantity * 0.85;
                    break;
                case "grapefruit":
                    result = quantity * 1.45;
                    break;
                case "kiwi":
                    result = quantity * 2.7;
                    break;
                case "pineapple":
                    result = quantity * 5.5;
                    break;
                case "grapes":
                    result = quantity * 3.85;
                    break;
            }
        }
        if (weekend) {
            switch (fruit) {
                case "banana":
                    result = quantity * 2.7;
                    break;
                case "apple":
                    result = quantity * 1.25;
                    break;
                case "orange":
                    result = quantity * 0.9;
                    break;
                case "grapefruit":
                    result = quantity * 1.6;
                    break;
                case "kiwi":
                    result = quantity * 3;
                    break;
                case "pineapple":
                    result = quantity * 5.6;
                    break;
                case "grapes":
                    result = quantity * 4.2;
                    break;
            }
        }
        if (!(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
                || day.equals("Thursday") || day.equals("Friday") || day.equals("Saturday") || day.equals("Sunday"))) {
            System.out.println("error");
        } else if (!(fruit.equals("banana") || fruit.equals("apple") || fruit.equals("orange")
                || fruit.equals("grapefruit") || fruit.equals("kiwi") || fruit.equals("pineapple")
                || fruit.equals("grapes"))) {
            System.out.println("error");
        } else {
            System.out.println(result);
        }
    }
}

