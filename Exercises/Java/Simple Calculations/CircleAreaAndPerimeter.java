import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double radius = Double.parseDouble(scanner.nextLine());

        double perimeter = Math.PI * 2 * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
