import java.util.Locale;
import java.util.Scanner;

public class Cadaparaula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String p1 = sc.next();
        String p2 = sc.next();
        String p3 = sc.next();
        String p4 = sc.next();
        String p5 = sc.next();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
    }
}
