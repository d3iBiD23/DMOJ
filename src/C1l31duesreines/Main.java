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

        
    }
}
