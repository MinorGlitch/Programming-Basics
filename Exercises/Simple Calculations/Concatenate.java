import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();

        String lastName = scanner.nextLine();

        int age = Integer.parseInt(scanner.nextLine());

        String town = scanner.nextLine();

        String result = String.format("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);

        System.out.println(result);
    }
}
