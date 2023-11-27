package Atròpodes;

import java.util.Locale;
import java.util.Scanner;

class Bicho {
    public final int potes;
    public final int qty;

    public Bicho(int potes, int qty) {
        this.potes = potes;
        this.qty = qty;
    }

    public int potesTotals(){
        return this.qty * this.potes;
    }
}

class Mi extends Bicho {
    public int segment;

    public Mi(int potes, int qty, int segment) {
        super(potes, qty);
        this.segment = segment;
    }
    public int potesTotalsM(){
        return this.potes * this.segment * this.qty;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        Bicho insecte = new Bicho(6, sc.nextInt());
        Bicho arac = new Bicho(8, sc.nextInt());
        Bicho crustaci = new Bicho(10, sc.nextInt());

        Mi miri2 = new Mi(2, sc.nextInt(), sc.nextInt());
        Mi miri4 = new Mi(4, sc.nextInt(), sc.nextInt());

        System.out.println(arac.potesTotals() + insecte.potesTotals() + crustaci.potesTotals() + miri2.potesTotalsM() + miri4.potesTotalsM());
    }
}