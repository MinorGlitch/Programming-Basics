import java.text.DecimalFormat;
import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat timeFormat = new DecimalFormat("00");

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        final int plusFifteen = 15;

        if (minutes + plusFifteen > 59) {
            minutes = minutes + plusFifteen - 60;
            hour += 1;
        } else {
            minutes += plusFifteen;
        }
        if (hour > 23) {
            hour = 0;
        }

        System.out.println(hour + ":" + timeFormat.format(minutes));
    }
}
