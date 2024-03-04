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
    private static int evaluateExp(String expressio){
        int posicioUltimaSuma = expressio.lastIndexOf("+");
        int posicioUltimaMulti = expressio.lastIndexOf("*");
        if (posicioUltimaSuma == -1 && posicioUltimaMulti == -1){
            // Caso BASE
            return Integer.parseInt(expressio);
        } else {
            // CAS RECURSIU
            if (posicioUltimaSuma == -1) {
                // AQUI ENTREM SI NOMES N'HI HA  MULTIPLICACIONS
                int resultat = 1;
                // EN CAS DE QUE HI NO HAGI SUMES, PERO SI MULTPLICACIONS
                String[] multiplicacions = expressio.split("\\*"); // ["123", "456"] // ["789", "12"]
                for (String multi : multiplicacions) {
                    resultat *= Integer.parseInt(multi);
                }
                return resultat;
            } else if (posicioUltimaMulti == -1){
                // AQUI ENTREM SI NOMÉS N'HI HA SUMES
                int resultat = 0;
                // EN CAS DE QUE NO HI HAGI SUMES, PERO SI MULTIPLICACIONS
                String[] sumes = expressio.split("\\+"); // ["56.088", "9468"]
                for (String sum : sumes) {
                    resultat += Integer.parseInt(sum);
                }
                return resultat;
            } else {
                String[] sumes = expressio.split("\\+"); // ["123*456", "789*12"]
                for (int i = 0; i < sumes.length; i++) {
                    int posicionUltimaMultiDelSplit = sumes[i].lastIndexOf("*");
                    if (!(posicionUltimaMultiDelSplit == -1)){
                        // AQUI TENIM DIVERSOS NUMEROS AMB DIFERENTS MULTIPLICACIONS "123*456"
                        String[] multiplicacions = sumes[i].split("\\*"); // ["123", "456"] // ["789", "12"]
                        int resultat = 1;
                        for (String multi : multiplicacions) {
                            resultat *= Integer.parseInt(multi);
                        }
                        sumes[i] = Integer.toString(resultat);
                    }
                }
                // sumes = ["56.088", "9468"]
                int resultatFinal = 0;
                for (String suma : sumes) {
                    resultatFinal += Integer.parseInt(suma);
                }
                return resultatFinal;
            }
        }
    }
}
