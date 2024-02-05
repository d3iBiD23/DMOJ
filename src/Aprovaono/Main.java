package Aprovaono;

import java.util.Locale;
import java.util.Scanner;

class Alumne{
    private String nom;
    private String cognom;
    private float nota;

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public Alumne(String nom, String cognom, float nota) {
        this.nom = nom;
        this.cognom = cognom;
        this.nota = nota;
    }

    public boolean aprovat(){
        return this.nota >= 5;
    }

    public String notaMissatge()
    {
        if (this.aprovat()) {
            return this.getNom() + " " + this.getCognom() + ": " + "aprova";
        }
        return this.getNom() + " " + this.getCognom() + ": " + "suspèn";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            Alumne a = new Alumne(sc.next(), sc.next(), sc.nextFloat());

            System.out.println(a.notaMissatge());
        }

        sc.close();

    }
}
