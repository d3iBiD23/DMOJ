package Longitudparaules;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        sc.nextInt();
        sc.nextLine();
        String[] paraules = sc.nextLine().split(" ");

        paraulaMesLLarga(paraules);
        paraulaMesCurta(paraules);

        int longitud = sc.nextInt();

        trobarLongitudParaula(paraules, longitud);
    }
    private static void paraulaMesLLarga(String[] paraules){
        String max = "";

        for (String p: paraules){
            if (p.length() > max.length()){
                max = p;
            }
        }

        System.out.println("La paraula més llarga és: " + max + " (" + max.length() + " lletres).");
    }
    private static void paraulaMesCurta(String[] paraules){
        String min = paraules[0];

        for (String p: paraules){
            if (p.length() < min.length()){
                min = p;
            }
        }

        System.out.println("La paraula més curta és: " + min + " (" + min.length() + " lletres).");
    }
    private static void trobarLongitudParaula(String[] paraules, int longitud){
        String paraula = "";
        boolean trobat = false;

        for (String p : paraules){
            if (p.length() == longitud){
                paraula = p;
                trobat = true;
            }
        }

        if (trobat){
            System.out.println("La paraula de longitud " + longitud + " que s'ha trobat és: " + paraula);
        }else {
            System.out.println("No s'ha trobat cap paraula de longitud " + longitud + ".");
        }
    }
}
