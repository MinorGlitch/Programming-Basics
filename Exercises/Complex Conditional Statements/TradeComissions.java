import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine().toLowerCase();

        double amountOfSales = Double.parseDouble(scanner.nextLine());

        double result = -1;

        if ((amountOfSales < 0) || !(town.equals("varna") || town.equals("sofia") || town.equals("plovdiv"))) {
            System.out.println("error");
        }

        if (amountOfSales >= 0 && amountOfSales <= 500) {
            switch (town) {
                case "sofia":
                    result = amountOfSales * 0.05;
                    System.out.printf("%.2f", result);
                    break;
                case "varna":
                    result = amountOfSales * 0.045;
                    System.out.printf("%.2f", result);
                    break;
                case "plovdiv":
                    result = amountOfSales * 0.055;
                    System.out.printf("%.2f", result);
                    break;
            }
        }
        if (amountOfSales > 500 && amountOfSales <= 1000) {
            switch (town) {
                case "sofia":
                    result = amountOfSales * 0.07;
                    System.out.printf("%.2f", result);
                    break;
                case "varna":
                    result = amountOfSales * 0.075;
                    System.out.printf("%.2f", result);
                    break;
                case "plovdiv":
                    result = amountOfSales * 0.08;
                    System.out.printf("%.2f", result);
                    break;
            }

        }
        if (amountOfSales > 1000 && amountOfSales <= 10000) {
            switch (town) {
                case "sofia":
                    result = amountOfSales * 0.08;
                    System.out.printf("%.2f", result);
                    break;
                case "varna":
                    result = amountOfSales * 0.1;
                    System.out.printf("%.2f", result);
                    break;
                case "plovdiv":
                    result = amountOfSales * 0.12;
                    System.out.printf("%.2f", result);
                    break;
            }

        }
        if (amountOfSales > 10000) {
            switch (town) {
                case "sofia":
                    result = amountOfSales * 0.12;
                    System.out.printf("%.2f", result);
                    break;
                case "varna":
                    result = amountOfSales * 0.13;
                    System.out.printf("%.2f", result);
                    break;
                case "plovdiv":
                    result = amountOfSales * 0.145;
                    System.out.printf("%.2f", result);
                    break;
            }
        }
    }
}
