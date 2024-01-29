package Embusalaronda;

import java.util.Locale;
import java.util.Scanner;

class Ronda{
    private int cotxes;
    private int temps;

    public Ronda(int cotxes, int temps) {
        this.cotxes = cotxes;
        this.temps = temps;
    }
    public float ratioCotxesMinut(){
        float cotxesMinut = ((float)this.cotxes / this.temps);
        return cotxesMinut;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        Ronda r = new Ronda(sc.nextInt(), sc.nextInt());

        float cotxesMinut = r.ratioCotxesMinut();

        if (cotxesMinut <= 375){
            System.out.println("No hi ha embús.");
        }
        else if (cotxesMinut > 375 && cotxesMinut <= 425) {
            System.out.println("Embús baix.");
        }
        else if (cotxesMinut > 425 && cotxesMinut <= 575){
            System.out.println("Embús moderat.");
        }
        else if (cotxesMinut > 575 && cotxesMinut <= 625) {
            System.out.println("Embús alt.");
        }
        else {
            System.out.println("Embús extrem.");
        }

        sc.close();
    }
}
