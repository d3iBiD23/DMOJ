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

        for (int i = 0; i < f; i++){
            for (int j = 0; j < c; j++){
                matriu[f][c] = sc.nextInt();
            }
        }
    }
}
