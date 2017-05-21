import java.util.Scanner;

public class PointInFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());

        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        boolean inside = (x > 0 && x < h * 3) && (y > 0 && y < h) ||
                (x > h && x < h * 2) && (y > 0 && y < 4 * h);

        boolean outside = ((x < 0 || x > h * 3) && y <= h) || ((x < h || x > h * 2) && y > h) ||
                (y < 0 || y > 4 * h);

        if (inside) {
            System.out.println("Inside");
        } else if (outside) {
            System.out.println("Outside");
        } else {
            System.out.println("Border");
        }
    }
}
