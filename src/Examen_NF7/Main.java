package Examen_NF7;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float n1 = sc.nextFloat();

        float n2 = sc.nextFloat();

        float n3 = sc.nextFloat();

        if (nExamensAprovats(n1, n2, n3) == 0){
            System.out.println("No s'ha aprovat cap examen.");
        }
        else if (nExamensAprovats(n1 , n2, n3) == 1) {
            System.out.println("S'ha aprovat un examen.");
        }
        else if (nExamensAprovats(n1, n2, n3) == 2) {
            System.out.println("S'han aprovat dos exàmens.");
        }
        else if (nExamensAprovats(n1, n2, n3) == 3){
            System.out.println("S'han aprovat tots els exàmens.");
        }

        sc.close();
    }
    public static int nExamensAprovats(float n1, float n2, float n3){
        int numExAprovats = 0;
        if (n1 < 5 && n2 < 5 && n3 < 5 ){
            numExAprovats = 0;
        }
        else if (n1 > 5 && n2 < 5 && n3 < 5 || n2 > 5 && n1 < 5 && n3 < 5 || n3 > 5 && n1 < 5 && n2 < 5) {
            numExAprovats = 1;
        }
        else if (n1 > 5 && n2 > 5 && n3 < 5|| n1 > 5 && n3 > 5 && n2 < 5 || n2 > 5 && n3 > 5 && n1 <5){
            numExAprovats = 2;
        }
        else{
            numExAprovats = 3;
        }
        return numExAprovats;
    }
}
