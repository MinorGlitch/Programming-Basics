
public class RectangleOf10x10Stars {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(repeatStr("*", 10));
        }
    }

    private static String repeatStr(String strToRepeat, int count) {
        StringBuilder character = new StringBuilder();

        for (int i = 0; i < count; i++) {
            character.append(strToRepeat);
        }
        return character.toString();
    }
}
