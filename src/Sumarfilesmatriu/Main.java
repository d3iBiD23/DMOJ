package Sumarfilesmatriu;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] array = new int[n][m];

        for (int i=0; i < n; i++){
            int resultatSuma = 0;

            for (int j=0; j < m; j++){
                array[i][j] = sc.nextInt();
                resultatSuma = resultatSuma + array[i][j];

            }
            System.out.println(resultatSuma);
        }
    }
}
