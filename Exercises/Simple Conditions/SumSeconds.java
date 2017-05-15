import java.text.DecimalFormat;
import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DecimalFormat time = new DecimalFormat("00");

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int minutes = 0;
        int seconds = a + b + c;


        if (seconds > 10 && seconds <= 59) {
            System.out.println(minutes + ":" + seconds);
        } else if (seconds >= 60 && seconds <= 119) {
            seconds -= 60;
            minutes++;
            System.out.println(minutes + ":" + time.format(seconds));
        } else if (seconds > 119 && seconds <= 179) {
            seconds -= 120;
            minutes += 2;
            System.out.println(minutes + ":" + time.format(seconds));
        } else if (a + b + c < 10) {
            System.out.println(minutes + ":" + time.format(seconds));
        }
    }
}
