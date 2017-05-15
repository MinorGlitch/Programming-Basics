import java.util.Scanner;

public class TwoDRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        double sideA = Math.abs(x2 - x1);
        double sideB = Math.abs(y2 - y1);

        double perimeter = (sideA + sideB) * 2;
        double area = sideA * sideB;

        System.out.println(area);
        System.out.println(perimeter);
    }
}
