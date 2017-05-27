import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFigure = scanner.nextLine();

        switch (typeOfFigure) {
            case "square": {

                double a = Double.parseDouble(scanner.nextLine());

                double result = a * a;

                System.out.println(result);
                break;
            }
            case "rectangle": {

                double a = Double.parseDouble(scanner.nextLine());
                double b = Double.parseDouble(scanner.nextLine());

                double result = a * b;

                System.out.println(result);
                break;
            }
            case "circle": {

                double r = Double.parseDouble(scanner.nextLine());

                double result = Math.PI * r * r;

                System.out.println(result);
                break;
            }
            case "triangle": {

                double a = Double.parseDouble(scanner.nextLine());
                double h = Double.parseDouble(scanner.nextLine());

                double result = a * h / 2;

                System.out.println(result);
                break;
            }
        }
    }
}
