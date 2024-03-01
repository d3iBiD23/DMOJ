package Verticalsiguals;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int files = sc.nextInt();
        int columnes = sc.nextInt();

        int[][] m = new int[files][columnes];

        for (int i = 0; i < files; i++){
            for (int j = 0; j < columnes; j++){
                m[i][j] = sc.nextInt();
            }
        }

        boolean esIgual = false;

        for (int j = 0; j < columnes; j++) {
            esIgual = true;

            for (int i = 1; i < files; i++) {
                int anterior = m[i - 1][j];
                int actual = m[i][j];

                if (actual != anterior) {
                    esIgual = false;
                    break;
                }
            }
            if (esIgual){
                break;
            }
        }
        if (!esIgual){
            System.out.println("No hi ha cap columna amb els números iguals.");
        }
    }
}