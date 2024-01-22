package Cargol;

import java.util.Locale;
import java.util.Scanner;

class Pal{
    private int altura;

    public Pal(int altura) {
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }
}

class Cargol{
    int mPujats;
    int mRelliscats;

    public Cargol(int mPujats, int mRelliscats) {
        this.mPujats = mPujats;
        this.mRelliscats = mRelliscats;
    }

    public int calcularDiasNecessaris(Pal pal) {
        int alturaPal = pal.getAltura();
        int metresFinals = mPujats - mRelliscats;

        if (metresFinals >= alturaPal){
            return 1;
        }

        int diesNecessaris = (alturaPal - mPujats + metresFinals - 1) / metresFinals;
        return diesNecessaris + 1;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        Pal pal = new Pal(sc.nextInt());

        Cargol cargol = new Cargol(sc.nextInt(), sc.nextInt());

        System.out.println(cargol.calcularDiasNecessaris(pal));

    }
}
