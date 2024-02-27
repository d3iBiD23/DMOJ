package Trasposarmatriu;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int files = sc.nextInt();
        int columnes = sc.nextInt();

        int[][] matriu = new int[files][columnes];

        for (int i=0; i<files; i++){
            for (int j=0; j<columnes; j++){
                matriu[i][j] = sc.nextInt();
            }
        }

        int[][] matriuInvertida = new int[columnes][files];

        for (int i=0; i<files; i++){
            for (int j=0; j<columnes; j++){
                matriuInvertida[j][i] = matriu[i][j];
            }
        }

        for (int i = 0; i < columnes; i++) {
            for (int j = 0; j < files; j++) {
                System.out.print(matriuInvertida[i][j] + " ");
            }
            System.out.println();
        }
    }
}
