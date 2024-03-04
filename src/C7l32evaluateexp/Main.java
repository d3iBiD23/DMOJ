package C7l32evaluateexp;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String expressio = sc.nextLine();

        // Dividir l'String en els operadors "+" i obtenir els sumands
        String[] numeros1 = expressio.split("\\+");

        int resultatP = 0;

        for (String num : numeros1){
            // Dividir cada sumand en els operadors "*" i multiplicar els valors
            String[] factors = num.split("\\*");
            int resultat = 1;

            for (String factor : factors){
                // Multiplicar cada factor convertit a Int
                resultat *= Integer.parseInt(factor.trim());
            }

            // Sumar el resultat parcial al resultat total
            resultatP += resultat;
        }
        System.out.println(resultatP);
    }
}
