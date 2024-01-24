package Cargol;

import java.util.Locale;
import java.util.Scanner;

class Cargol{
    private int metresPujats;
    private int metresRelliscats;

    public Cargol(int metresPujats, int metresRelliscats) {
        this.metresPujats = metresPujats;
        this.metresRelliscats = metresRelliscats;
    }

    public int calcularDiesNecessaris(int alturaPal){
        int distanciaNetaDiaria = this.metresPujats - this.metresRelliscats;

        if (distanciaNetaDiaria == alturaPal){
            return 1;
        }

        int diesNecessaris = (alturaPal - metresPujats + distanciaNetaDiaria - 1) / distanciaNetaDiaria;
        return diesNecessaris + 1;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int alturaPal = sc.nextInt();

        Cargol c = new Cargol(sc.nextInt(), sc.nextInt());

        System.out.println(c.calcularDiesNecessaris(alturaPal));

        sc.close();
    }
}
