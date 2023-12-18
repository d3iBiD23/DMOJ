package Unicodepoints;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int cP1 = sc.nextInt();
        int cP2 = sc.nextInt();
        int cP3 = sc.nextInt();
        int cP4 = sc.nextInt();
        int cP5 = sc.nextInt();
        int cP6 = sc.nextInt();

        String textFinal = "" + (char)cP1 + (char)cP2 + (char)cP3 + (char)cP4 + (char)cP5 + (char)cP6;

        System.out.println(textFinal);
    }
}
