package CalculDeNotes;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float nota = sc.nextFloat();

        if (nota < 5){
            System.out.println("INSUFICIENT");
        }
        else if (nota >= 5 && nota < 6) {
            System.out.println("SUFICIENT");
        }
        else if (nota >= 6 && nota < 7 ) {
            System.out.println("BE");
        }
        else if (nota >= 7 && nota < 8.5) {
            System.out.println("NOTABLE");
        }
        else if (nota >= 8.5 && nota < 10) {
            System.out.println("EXCEL.LENT");
        }
        else if (nota == 10) {
            System.out.println("MATRICULA");
        }
    }
}
