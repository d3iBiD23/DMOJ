package Examen;

import java.util.Locale;
import java.util.Scanner;

class Alumne{
    private float notaEx1;
    private float notaEx2;
    private float notaEx3;

    public Alumne(float notaEx1, float notaEx2, float notaEx3) {
        this.notaEx1 = notaEx1;
        this.notaEx2 = notaEx2;
        this.notaEx3 = notaEx3;
    }

    public String missatgeNota(){
        if (this.notaEx1 < 5 && this.notaEx2 < 5 && this.notaEx3 < 5){
            return "No s'ha aprovat cap examen.";
        }else if (this.notaEx1 >= 5 && this.notaEx2 < 5 && this.notaEx3 < 5 || this.notaEx1 < 5 && this.notaEx2 >= 5 && this.notaEx3 < 5 || this.notaEx1 < 5 && this.notaEx2 < 5 && this.notaEx3 >= 5){
            return "S'ha aprovat un examen.";
        } else if (this.notaEx1 >= 5 && this.notaEx2 >= 5 && this.notaEx3 < 5 || this.notaEx1 < 5 && this.notaEx2 >= 5 && this.notaEx3 >= 5 || this.notaEx1 >= 5 && this.notaEx2 < 5 && this.notaEx3 >= 5) {
            return "S'han aprovat dos exàmens.";
        }else{
            return "S'han aprovat tots els exàmens.";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int nAlumnes = sc.nextInt();


        for (int i = 0; i < nAlumnes; i++){
            Alumne a = new Alumne(sc.nextFloat(), sc.nextFloat(), sc.nextFloat());

            System.out.println(a.missatgeNota());
        }
    }
}
