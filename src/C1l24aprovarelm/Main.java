package C1l24aprovarelm;

import java.util.Locale;
import java.util.Scanner;

class Modul {
    public boolean modulAprovat(int PrUf1, int PrLlUf1, int nExUf1, int PrUf2, int PrLlUf2, int nExUf2, int PrUf3, int PrLlUf3, int nExUf3){
        boolean aprovatuf1 = (PrLlUf1 >= (75 * PrUf1 /100) && nExUf1 >= 4) || ((PrLlUf1 >= (50 * PrUf1 /100) && nExUf1 >= 5) || nExUf1 > 7);
        boolean aprovatuf2 = (PrLlUf2 >= (75 * PrUf2 / 100) && nExUf2 >= 4) || (PrLlUf2 == PrUf2) || (PrLlUf2 >= (50 * PrUf2 / 100) && nExUf2 >= 5);
        boolean aprovatuf3 = (PrLlUf3 == PrUf3) && (nExUf3 >= 5);
        return aprovatuf1 && aprovatuf2 && aprovatuf3;
    }
}

class Alumne {
    private Modul m01;
    private Modul m02;
    private Modul m03;

    public Alumne(Modul m01, Modul m02, Modul m03) {
        this.m01 = m01;
        this.m02 = m02;
        this.m03 = m03;
    }
    public boolean aprovatCurs(){
        return (m01.modulAprovat() && m02.modulAprovat() && m03.modulAprovat());
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        Modul m1 = new Modul();

        System.out.println(m1.modulAprovat(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }
}