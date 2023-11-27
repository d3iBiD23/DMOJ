package Stigidsert;

import java.util.Locale;
import java.util.Scanner;

public class Stigidsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numero = sc.nextInt();

        int d1 = numero % 10;
        int d2 = (numero / 10) % 10;
        int d3 = numero / 100;

        int numeroInvertit = d1 * 100 + d2 * 10 + d3;

        System.out.println(numeroInvertit);
    }
}
