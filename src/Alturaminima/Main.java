package Alturaminima;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int qtyNens = sc.nextInt();

        float[] arrayNens = new float[qtyNens];


        for (int i = 0; i < qtyNens; i++){

            arrayNens[i] = sc.nextFloat();

        }

        float alturaMin = sc.nextFloat();

        for (float a: arrayNens){
            System.out.println(a >= alturaMin ? "SI" : "NO");
        }

        sc.close();
    }
}