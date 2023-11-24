import java.util.Locale;
import java.util.Scanner;

public class cadaparaulaaunal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        String[] paraules = new String[5];

        for (int i = 0; i < 5; i++) {
            paraules[i] = scanner.next();
        }

        for (String paraula : paraules) {
            System.out.println(paraula);
        }
    }
}