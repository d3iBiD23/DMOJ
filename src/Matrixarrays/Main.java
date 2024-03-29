package Matrixarrays;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int f = sc.nextInt();

        int c = sc.nextInt();

        int[][] matriu = new int[f][c];

        int contador0 = 0;
        int contador1 = 0;

        for (int i = 0; i < f; i++){

            for (int j = 0; j < c; j++){
                matriu[i][j] = sc.nextInt();

                if (matriu[i][j] == 0){
                    contador0++;
                } else if (matriu[i][j] == 1) {
                    contador1++;
                }
            }
        }
        System.out.println(contador0 + " " + contador1);
    }
}
