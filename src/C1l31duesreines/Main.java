package C1l31duesreines;

import java.util.Locale;
import java.util.Scanner;

class Reina{
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Reina(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        Reina r1 = new Reina(sc.nextInt(), sc.nextInt());
        Reina r2 = new Reina(sc.nextInt(), sc.nextInt());

        boolean amenacenL = (r1.getX() == r2.getX() || r1.getY() == r2.getY());
        boolean amenacenC = (r1.getX() == r1.getY() && r2.getX() == r2.getY());
        //boolean amenacenCl = ();

        boolean amenacen = (amenacenL || amenacenC);

        System.out.println(amenacen);
    }
}
