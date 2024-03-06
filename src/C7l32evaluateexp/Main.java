package C7l32evaluateexp;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String expressio = sc.nextLine();

        System.out.println(evaluateExp(expressio));
    }
    private static int evaluateExp(String expressio) {
        int posicionUltimaSuma = expressio.lastIndexOf("+");
        int posicionUltimaMulti = expressio.lastIndexOf("*");

        if (posicionUltimaSuma == -1 && posicionUltimaMulti == -1) {
            // CAS BASE
            return Integer.parseInt(expressio);
        } else {
            // CAS RECURSIU
            if (posicionUltimaSuma == -1) {
                // AQUI ENTREM SI SOLAMENT N'HI HA MULTIPLICACIONS
                int resultat = 1;
                // EN CAS DE QUE NO HI HAGI SUMES, PERO SI MULTIPLICACIONS
                String[] multiplicacions = expressio.split("\\*"); // ["123", "456"] // ["789", "12"]
                for (String s : multiplicacions) {
                    resultat *= Integer.parseInt(s);
                }
                return resultat;
            } else if (posicionUltimaMulti == -1) {
                // AQUI ENTREM SI SOLAMENT N'HI HA SUMAS
                int resultat = 0;
                // EN CAS DE QUE NO HI HAGI SUMES, PERO SI MULTIPLICACIONS
                String[] sumas = expressio.split("\\+"); // ["56.088", "9468"]
                for (String s : sumas) {
                    resultat += Integer.parseInt(s);
                }
                return resultat;
            } else {
                String[] sumas = expressio.split("\\+"); // ["123*456", "789*12"]
                for (int i = 0; i < sumas.length; i++) {
                    int posicionUltimaMultiDelSplit = sumas[i].lastIndexOf("*");
                    if (posicionUltimaMultiDelSplit != -1) {
                        // AQUI TENIM DIVERSOS NUMEROS AMB DIFERENTS MULTIPLICACIONS "123*456"
                        sumas[i] = String.valueOf(evaluateExp(sumas[i]));
                    }
                }
                int resultadoFinal = 0;
                for (String sum : sumas) {
                    resultadoFinal += evaluateExp(sum);
                }
                return resultadoFinal;
            }
        }
    }
}
