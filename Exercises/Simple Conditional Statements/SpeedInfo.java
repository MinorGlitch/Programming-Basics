import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double speed = Double.parseDouble(scanner.nextLine());

        boolean slow = speed <= 10;
        boolean average = speed > 10 && speed <= 50;
        boolean fast = speed > 50 && speed <= 150;
        boolean ultraFast = speed > 150 && speed <= 1000;

        if (slow) {
            System.out.println("slow");
        } else if (average) {
            System.out.println("average");
        } else if (fast) {
            System.out.println("fast");
        } else if (ultraFast) {
            System.out.println("ultra fast");
        } else {
            System.out.println("extremely fast");
        }
    }
}
