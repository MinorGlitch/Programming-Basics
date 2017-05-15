import java.util.Scanner;

public class Nums100To200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        boolean between = number >= 100 && number <= 200;

        if (between) {
            System.out.println("Between 100 and 200");
        } else  if (number > 200){
            System.out.println("Greater than 200");
        } else {
            System.out.println("Less than 100");
        }
    }
}
