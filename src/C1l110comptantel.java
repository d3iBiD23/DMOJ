import java.util.Locale;
import java.util.Scanner;

public class C1l110comptantel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int hores = sc.nextInt();
        int minuts = sc.nextInt();

        int minutsActuals = hores * 60 + minuts;
        int minutsFalten = (24 * 60) - minutsActuals;

        System.out.println(minutsFalten);
    }
}
