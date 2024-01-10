package C1l24aprovarelm;

import java.util.Locale;
import java.util.Scanner;

abstract class UF{
    public int pTotals;
    public int pEntregades;
    public int nExamen;
    public boolean resultat;

    public UF(int pTotals, int pEntregades, int nExamen) {
        this.pTotals = pTotals;
        this.pEntregades = pEntregades;
        this.nExamen = nExamen;
    }
    public boolean aprovar(){
        return true;
    }

    public boolean aprovar(int actitud){
    }
}

class UF1 extends UF{

    public UF1(int pTotals, int pEntregades, int nExamen) {
        super(pTotals, pEntregades, nExamen);
    }
    @Override
    public boolean aprovar(){

    }
}
class UF2 extends UF{

    public UF2(int pTotals, int pEntregades, int nExamen) {
        super(pTotals, pEntregades, nExamen);
    }
    @Override
    public boolean aprovar(){

    }
}
class UF3 extends UF{

    public UF3(int pTotals, int pEntregades, int nExamen) {
        super(pTotals, pEntregades, nExamen);
    }
    @Override
    public boolean aprovar(){

    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);


    }
}