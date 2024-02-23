package Galib;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float alturaVehicle = sc.nextFloat();

        int nombrePonts = sc.nextInt();

        float[] ponts = new float[nombrePonts];

        for (int i = 0; i < ponts.length; i++){
            ponts[i] = sc.nextFloat();
        }

        for (int i = 0; i < ponts.length; i++){
            if (ponts[i] < alturaVehicle){
                System.out.println("xoca amb el pont " + (i + 1));
                break;
            }
        }
    }
}
