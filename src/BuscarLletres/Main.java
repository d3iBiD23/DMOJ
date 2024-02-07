package BuscarLletres;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        char letra = sc.nextLine().charAt(0);

        String frase = sc.nextLine();

        sc.close();

        int resultado = contarOcurrencias(letra, frase);

        System.out.println(resultado);
    }

    private static int contarOcurrencias(char letra, String frase) {
        char[] array = frase.toCharArray();

        int contador = 0;

        for (char c : array) {
            if (c == letra) {
                contador++;
            }
        }

        return contador;
    }
}
