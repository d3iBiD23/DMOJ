package ObrirCandau;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int clau = sc.nextInt();

        ArrayList<Integer> array = new ArrayList<>();

        while (true) {
            int numero = sc.nextInt();

            if (numero == -1) {
                break;
            } else {
                array.add(numero);
            }

        }
        array.get(0);
    }
}