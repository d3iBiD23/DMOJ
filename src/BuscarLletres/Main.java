package BuscarLletres;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        char lletra = sc.nextLine().charAt(0);

        String frase = sc.nextLine();

        char[] lletres = frase.toCharArray();

        int acumulador = 0;

        for (char c : lletres){
            if (c == lletra){
                acumulador++;
            }
        }

        System.out.println(acumulador);
    }
}
