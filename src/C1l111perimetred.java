import java.util.Locale;
import java.util.Scanner;

public class C1l111perimetred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int x1 = sc.nextInt();

        int y1 = sc.nextInt();

        int x2 = sc.nextInt();

        int y2 = sc.nextInt();

        sc.close();

        int base = Math.abs(x2 - x1);
        int altura = Math.abs(y2 - y1);
        int perimetro = 2 * (base + altura);

        System.out.println(perimetro);
    }

}
