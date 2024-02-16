package Extracciodenumeros;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String cadena = sc.nextLine();

        int acumulador = 0;

        for (int i = 1; i < cadena.length(); i += 2){
            int numero = Character.getNumericValue(cadena.charAt(i));

            acumulador+=numero;
        }
        System.out.println(acumulador);
    }
}
