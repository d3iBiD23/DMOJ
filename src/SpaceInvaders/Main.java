package SpaceInvaders;

import java.util.Locale;
import java.util.Scanner;

class Alien{
    private int x;
    private int y;
    private int amplada;
    private int alcada;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAmplada() {
        return amplada;
    }

    public int getAlcada() {
        return alcada;
    }

    public Alien(int x, int y, int amplada, int alcada) {
        this.x = x;
        this.y = y;
        this.amplada = amplada;
        this.alcada = alcada;
    }
}

class Disparo{
    private int x;
    private int y;
    private int amplada;
    private int alcada;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAmplada() {
        return amplada;
    }

    public int getAlcada() {
        return alcada;
    }

    public Disparo(int x, int y, int amplada, int alcada) {
        this.x = x;
        this.y = y;
        this.amplada = amplada;
        this.alcada = alcada;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        Alien a1 = new Alien(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        Disparo d1 = new Disparo(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        boolean colisiona = (a1.getX() < d1.getX() + d1.getAmplada() && a1.getX() + a1.getAmplada() > d1.getX() && a1.getY() < d1.getY() + d1.getAlcada() && a1.getY() + a1.getAlcada() > d1.getY());

        System.out.println(colisiona);
    }
}
