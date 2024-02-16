package Vocalesmayusculas;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String frase = sc.nextLine();

//        while (frase.equals("END")){
//            break;
//        }

//        int a = frase.indexOf("a");
//        int e = frase.indexOf("e");
//        int i = frase.indexOf("i");
//        int o = frase.indexOf("o");
//        int u = frase.indexOf("u");



        char a = frase.charAt(frase.indexOf('a'));
        char e = frase.charAt(frase.indexOf('a'));
        char i = frase.charAt(frase.indexOf('a'));
        char o = frase.charAt(frase.indexOf('a'));
        char u = frase.charAt(frase.indexOf('a'));

    }
}
