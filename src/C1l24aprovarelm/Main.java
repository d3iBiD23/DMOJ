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
}

class UF1 extends UF{


    public UF1(int pTotals, int pEntregades, int nExamen) {
        super(pTotals, pEntregades, nExamen);
    }
    @Override
    public boolean aprovar(){
        return (pEntregades == (75 * pTotals / 100) && (nExamen >= 4)) || (pEntregades == (50 * pTotals / 100) && nExamen >= 5) || (nExamen > 7);
    }
}
class UF2 extends UF{

    public UF2(int pTotals, int pEntregades, int nExamen) {
        super(pTotals, pEntregades, nExamen);
    }
    @Override
    public boolean aprovar(){
        return (pEntregades == (75 * pTotals / 100) && nExamen >= 4) || (pEntregades == pTotals) || (pEntregades >= (50 * pTotals / 100) && nExamen >= 5);
    }
}
class UF3 extends UF{

    public UF3(int pTotals, int pEntregades, int nExamen) {
        super(pTotals, pEntregades, nExamen);
    }
    @Override
    public boolean aprovar(){
        return (pEntregades == pTotals) && (nExamen >= 5);
    }
}
class Modul{
    private final UF1 uf1;
    private final UF2 uf2;
    private final UF3 uf3;

    public Modul(UF1 uf1, UF2 uf2, UF3 uf3) {
        this.uf1 = uf1;
        this.uf2 = uf2;
        this.uf3 = uf3;
    }

    public boolean isModulAprovat(){
        return uf1.aprovar() && uf2.aprovar() && uf3.aprovar();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        UF1 uf1 = new UF1(sc.nextInt(), sc.nextInt(), sc.nextInt());
        UF2 uf2 = new UF2(sc.nextInt(), sc.nextInt(), sc.nextInt());
        UF3 uf3 = new UF3(sc.nextInt(), sc.nextInt(), sc.nextInt());

        Modul modul1 = new Modul(uf1, uf2, uf3);

        boolean isModulAprovat = modul1.isModulAprovat();

        System.out.println(isModulAprovat);
    }
}