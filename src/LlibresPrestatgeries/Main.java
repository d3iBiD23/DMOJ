package LlibresPrestatgeries;

import java.util.Locale;
import java.util.Scanner;

class Prestatgeria{
    private int qtyPres;
    private int nPres;
    private int qLlibres;

    public int getQtyPres() {
        return qtyPres;
    }

    public int getnPres() {
        return nPres;
    }

    public int getqLlibres() {
        return qLlibres;
    }

    public Prestatgeria(int qtyPres, int nPres, int qLlibres) {
        this.qtyPres = qtyPres;
        this.nPres = nPres;
        this.qLlibres = qLlibres;
    }
    public static boolean caben(int qtyPres, int nPres, int qLlibres, int qtyLlibresMiquel){
        return (qtyPres * nPres * qLlibres) >= qtyLlibresMiquel;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println(Prestatgeria.caben(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }
}