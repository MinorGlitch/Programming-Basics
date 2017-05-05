import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double conversionUnit = 2.54;

        double inches = Double.parseDouble(scanner.nextLine());

        double centimeters = inches * conversionUnit;

        System.out.println(centimeters);
    }
}
