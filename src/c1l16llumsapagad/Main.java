package c1l16llumsapagad;

import java.util.Locale;
import java.util.Scanner;

class Llum {
    private boolean ences;

    public boolean isEnces() {
        return ences;
    }

    public Llum(boolean ences) {
        this.ences = ences;
    }
    public boolean comprovarLlum(){
        return !ences;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        Llum llum1 = new Llum(sc.nextBoolean());
        Llum llum2 = new Llum(sc.nextBoolean());
        Llum llum3 = new Llum(sc.nextBoolean());
        Llum llum4 = new Llum(sc.nextBoolean());
        
        sc.close();

        boolean totesEnceses = llum1.comprovarLlum() && llum2.comprovarLlum() && llum3.comprovarLlum() && llum4.comprovarLlum();

        System.out.println(totesEnceses);
    }
}
