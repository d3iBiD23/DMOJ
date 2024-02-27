package Buscandominas;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int files = sc.nextInt();
        int columnes = sc.nextInt();

        int[][] tauler = new int[files][columnes];

        for (int i=0; i<files; i++){
            for (int j=0; j<columnes; j++){
                tauler[i][j] = sc.nextInt();
            }
        }

        int fila, columna;
        while (true){
            fila = sc.nextInt();
            columna = sc.nextInt();

            if (fila == 0 && columna == 0){
                break;
            }

            fila--;
            columna--;

            if (tauler[fila][columna] == 1){
                System.out.println("SI");
            }else {
                System.out.println("NO");
            }
        }
    }
}
