package Cargol;

import java.util.Locale;
import java.util.Scanner;

class Cargol{
    private int mPujats;
    private int mRelliscats;

    public Cargol(int mPujats, int mRelliscats) {
        this.mPujats = mPujats;
        this.mRelliscats = mRelliscats;
    }

    public int pujar(int alçadaPal){
        int metresFinals = mPujats - mRelliscats;

        if (metresFinals < alçadaPal){

        }

        return 0;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        Cargol c = new Cargol(sc.nextInt(), sc.nextInt());

        c.pujar(sc.nextInt());

    }
}
