package Exercici_26;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float n1 = sc.nextFloat();

        int n2 = sc.nextInt();

        if (n1 + n2 > 10){
            System.out.println("Valor màxim excedit");
        }
        else{
            System.out.println(n1+n2);
        }

        sc.close();
    }
}
