package Examen;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();

        sc.nextLine();

        char[][] matriu = new char[n][];

        for (int i = 0; i < matriu.length; i++){
            matriu[i] = sc.nextLine().toCharArray();
        }

        for (int i = 0; i < matriu.length; i++){
            for (int j = 0; j < matriu[i].length; j++){
                if (matriu[i][j] == '^'){
                    maze(i,j,matriu);
                    mostrarMatriu(matriu);
                    return;
                }
            }
        }
    }
    private static void mostrarMatriu(char[][] matriu){
        for (char[] chars : matriu){
            System.out.println(String.valueOf(chars));
        }
    }
    private static boolean maze(int i, int j, char[][] matriu){
        if (i < 0 || i >= matriu.length || j < 0 || j >= matriu[i].length){
            return false;
        } else if (matriu[i][j] == 'o' || matriu[i][j] == '#') {
            return false;
        } else if (matriu[i][j] == '_') {
            matriu[i][j] = 'o';
            return true;
        }else{
            matriu[i][j] = 'o';

            boolean arribaIzq = maze(i-1,j+1,matriu);
            boolean arribaDer = maze(i-1,j-1,matriu);
            boolean abajoDer = maze(i+1,j+1,matriu);
            boolean abajoIzq = maze(i+1,j-1,matriu);

            boolean camiTrobat = (abajoDer || arribaDer || abajoIzq || arribaIzq);

            if (!camiTrobat){
                matriu[i][j] = ' ';
            }return camiTrobat;
        }
    }
}
