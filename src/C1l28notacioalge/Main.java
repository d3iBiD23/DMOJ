package C1l28notacioalge;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int fila = sc.nextInt();
        int columna = sc.nextInt();

        char lletraColumna = (char) ('a' + columna - 1);

        System.out.println("" + lletraColumna + fila);
    }
}
