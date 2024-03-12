package c4l42maze;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();

        char[][] matrix = new char[n][];
        sc.nextLine();

        for (int i = 0; i < n; i++){
            matrix[i] = sc.nextLine().toCharArray();
        }

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] == '^'){
                    maze(i,j,matrix);
                    mostrarMatriu(matrix);
                    return;
                }
            }
        }
    }

    private static void mostrarMatriu(char[][] matriu){
        for (char[] chars : matriu) {
            System.out.println(String.valueOf(chars));
        }
    }
    private static boolean maze(int i, int j, char[][] matrix){
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[i].length){
            return false;
        } else if (matrix[i][j] == 'o' || matrix[i][j] == '#'){
            return false;
        } else if (matrix[i][j] == '_') {
            matrix[i][j] = 'o';
            return true;
        }else {
            matrix[i][j] = 'o';

            boolean down = maze(i+1,j,matrix);
            boolean right = maze(i,j+1,matrix);
            boolean up = maze(i-1,j,matrix);
            boolean left = maze(i,j-1,matrix);

            boolean camiTrobat = (down || right || up || left);

            if (!camiTrobat) matrix[i][j] = ' ';
            return camiTrobat;
        }
    }
}