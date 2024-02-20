package Verticalsiguals;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int f = sc.nextInt();
        int c = sc.nextInt();

        int[][] matriu = new int[f][c];


        for (int i=0; i < f; i++){

            for (int j=0; j < c; j++){
                matriu[i][j] = sc.nextInt();

            }
        }
        int columnaIgual = verificarColumnaIgual(matriu);

        if (columnaIgual != -1) {
            System.out.println("La columna " + columnaIgual + " té tots els números iguals.");
        } else {
            System.out.println("No hi ha cap columna amb els números iguals.");
        }

    }
    private static int verificarColumnaIgual(int[][] matriu) {
        int fila = matriu.length;
        int columnas = matriu[0].length;

        if (fila == 1) {
            int valorAComparar = matriu[0][0];
            for (int col = 1; col < columnas; col++) {
                if (matriu[0][col] != valorAComparar) {
                    return -1;
                }
            }
            return 0;
        }

        for (int col = 0; col < columnas; col++) {
            int valorAComparar = matriu[0][col];

            for (int f = 1; f < fila; f++) {
                if (matriu[f][col] != valorAComparar) {
                    break;
                } else if (f == fila - 1) {
                    return col;
                }
            }
        }

        return -1;
    }
}
