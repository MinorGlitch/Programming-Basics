import java.util.Scanner;

/**
 * Created by Alex on 22.4.2017 г..
 */
public class TriangleOf55Strars {
    public static void main(String[] args) {


        for (int i = 1; i <11; i++) {
            System.out.println(repeatString("*", i));
        }
    }

    private static String repeatString (String newString, int count) {
        String result = "";
        for (int i = 0; i <count; i++) {
            result += newString;
        }
            return result;
    }
}
