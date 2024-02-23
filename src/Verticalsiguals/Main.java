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

        int columesIguals = verticalsIguals(m);

        if (columesIguals != -1){
            System.out.println("La columna " + columesIguals + " té tots els números iguals.");
        }else {
            System.out.println("No hi ha cap columna amb els números iguals.");
        }
    }

    private static int verticalsIguals(int[][] matriu){

        int fila = matriu.length;
        int columnes = matriu[0].length;

        if (fila == 1){
            int valorAComparar = matriu[0][0];

            for (int col = 1; col < columnes; col++){
                if (matriu[0][col] != valorAComparar){
                    return -1;
                }
            }
            return 0;
        }
        for (int col = 0; col < columnes; col++){
            int valorAComparar = matriu[0][col];

            for (int f = 1; f < fila; f++){
                if (matriu[f][col] != valorAComparar){
                    break;
                } else if (f == fila - 1) {
                    return col;
                }
            }
        }
        return -1;
    }
}