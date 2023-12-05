package MajorEdat;

import java.util.Locale;
import java.util.Scanner;

class Persona{
    private int edat;

    public int getEdat() {
        return edat;
    }

    public Persona(int edat) {
        this.edat = edat;
    }
    public boolean majorEdat(){
        return (edat >= 18);
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        Persona p1 = new Persona(sc.nextInt());

        System.out.println(p1.majorEdat());
    }
}
