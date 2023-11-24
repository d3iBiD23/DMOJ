import java.util.Locale;
import java.util.Scanner;
public class Arxiusdecodifont {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        String nomArxiu = scanner.next();
        String tipusArxiu = scanner.nextLine().trim();
        String nomArxiu2 = scanner.next();
        String tipusArxiu2 = scanner.nextLine().trim();
        String nomArxiu3 = scanner.next();
        String tipusArxiu3 = scanner.nextLine().trim();
        String nomArxiu4 = scanner.next();
        String tipusArxiu4 = scanner.nextLine().trim();

        System.out.println(tipusArxiu4 + " " + nomArxiu4);
        System.out.println(tipusArxiu3 + " " + nomArxiu3);
        System.out.println(tipusArxiu2 + " " + nomArxiu2);
        System.out.println(tipusArxiu + " " + nomArxiu);
    }
}