package Cerosdebajodelad;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();

        int[][] matriu = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matriu[i][j] = sc.nextInt();
            }
        }

        boolean totZeros = true;

        for (int i = 1; i < n; i++){
            for (int j = 0; j < i; j++){
                if (matriu[i][j] != 0){
                    totZeros = false;
                    break;
                }
            }
            if (!totZeros){
                break;
            }
        }

        if (totZeros){
            System.out.println("SI");
        }else {
            System.out.println("NO");
        }
    }
}