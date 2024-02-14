package BuscarLletres;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        char lletra = sc.nextLine().charAt(0);

        String frase = sc.nextLine();
        
        System.out.println(contarLletres(lletra, frase));

    }

    private static int contarLletres(char lletra, String frase){
        char[] array = frase.toCharArray();

        int contador = 0;

        for (char c : array){
            if (lletra == c) {
                contador++;
            }
        }

        return contador;
    }
}
