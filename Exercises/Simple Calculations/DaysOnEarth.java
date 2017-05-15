import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DaysOnEarth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate formatteddate = LocalDate.parse(scanner.nextLine(), formatter);

        formatteddate = formatteddate.plusDays(999);

        System.out.println(formatteddate.format(formatter));
    }
}
