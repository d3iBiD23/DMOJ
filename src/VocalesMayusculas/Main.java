package VocalesMayusculas;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String texto = sc.nextLine();

        boolean end = false;

        while (end){
            if (texto.equals("END")){
                break;
            }
        }

    }
}