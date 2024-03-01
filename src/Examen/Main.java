package Examen;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();

        String[][] matriu = new String[n][n];


        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                matriu[i][j]= sc.next();
            }
        }

        int coordX = sc.nextInt();
        int coordY = sc.nextInt();

        boolean esCapicua = false;

        String paraula = matriu[coordX][coordY];

        char[] paraulaChar = paraula.toCharArray();

        for (int i = 0; i < paraula.length(); i++){
            for (int j = 0; j < i; j++){
                if (paraula.charAt(i)==paraulaChar[j]){
                    esCapicua=true;
                    break;
                }
            }
        }

        System.out.println(esCapicua);
    }
}
