import java.util.Locale;
import java.util.Scanner;

public class Arecompte {
    private int a;
    private int b;
    private int n;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getN() {
        return n;
    }

    public Arecompte(int a, int b, int n) {
        this.a = a;
        this.b = b;
        this.n = n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        Arecompte a1 = new Arecompte(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.println(a1.n * (a1.b + a1.a));

    }
}