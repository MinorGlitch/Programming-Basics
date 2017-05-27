import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int a = Integer.parseInt(scanner.nextLine());

        try {
            System.out.println(days[a - 1]);
        } catch (Exception ex) {
            System.out.println("error");
        }
    }
}
