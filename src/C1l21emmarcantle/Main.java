package C1l21emmarcantle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //FOTO
        int xf1 = sc.nextInt();
        int yf1 = sc.nextInt();

        int xf2 = sc.nextInt();
        int yf2 = sc.nextInt();

        //MARCO
        int xm1 = sc.nextInt();
        int ym1 = sc.nextInt();

        int xm2 = sc.nextInt();
        int ym2 = sc.nextInt();

        float alturaM = Math.abs(ym2 - ym1);
        float baseM = Math.abs(xm2 - xm1);

        float alturaF = Math.abs(yf2 - yf1);
        float baseF = Math.abs(xf2 - xf1);

        float proporcioF = (baseF / alturaF);
        float proporcioM = (baseM / alturaM);

        boolean cap = (alturaM >= alturaF && baseM >= baseF);
        boolean proporcioIgual = (proporcioF == proporcioM);

        boolean adequat = cap && proporcioIgual;

        System.out.println(adequat);
    }
}
