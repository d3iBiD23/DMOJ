import java.util.Locale;
import java.util.Scanner;

public class cadaparaulaaunal {
    public static void main(String[] args) {
        String[] paraules = SetArray();
        ViewArray(paraules);
    }
    private static void ViewArray(String[] array)
    {
        for (String paraula : array) {
            System.out.println(paraula);
        }
    }
    private static String[] SetArray() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        String[] paraules = new String[5];

        for (int i = 0; i < 5; i++) {
             paraules[i] = scanner.next();
         }
        return paraules;
    }
}