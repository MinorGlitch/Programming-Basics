import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfProjection = scanner.nextLine();

        int c = Integer.parseInt(scanner.nextLine());

        int r = Integer.parseInt(scanner.nextLine());

        double x = 0.0;

        switch (typeOfProjection) {
            case "Premiere":
                x = 12;
                break;
            case "Normal":
                x = 7.5;
                break;
            case "Discount":
                x = 5;
                break;
        }

        double result = c * r * x;

        System.out.println(result);
    }
}
