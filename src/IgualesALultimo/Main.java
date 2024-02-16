package IgualesALultimo;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int qtyNum = sc.nextInt();

        int[] arrayNums = new int[qtyNum];

        for (int i = 0; i < qtyNum; i++){

            arrayNums[i] = sc.nextInt();
        }

        int ultimElement = arrayNums[arrayNums.length - 1];

        int contador = 0;

        for (int i = 0; i < arrayNums.length - 1; i++) {
            if (arrayNums[i] == ultimElement) {
                contador++;
            }
        }

        System.out.println(contador);
    }
}
