import java.util.Locale;
import java.util.Scanner;

public class MajorEdat {

    public boolean majoredat;

    public int edat;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        int edat = scanner.nextInt();

        boolean esMajor = verificarEdat(edat);

        System.out.println(esMajor);
    }
    public static boolean verificarEdat(int edat) {
        return edat >= 18;
    }
}
