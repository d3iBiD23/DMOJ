package Longitudparaules;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        sc.nextLine();
        String[] paraules = sc.nextLine().split(" ");

        lletraMesLLarga(paraules);
        lletraMesCurta(paraules);

        int longitud = sc.nextInt();

        trobarLletraLongitud(paraules, longitud);
    }
    private static void lletraMesLLarga(String[] paraules){
        String max = "";

        for (String p: paraules){
            if (p.length() > max.length()){
                max = p;
            }
        }

        System.out.println("La paraula més llarga és: " + max + " (" + max.length() + " lletres).");
    }
    private static void lletraMesCurta(String[] paraules){
        String min = paraules[0];

        for (String p: paraules){
            if (p.length() < min.length()){
                min = p;
            }
        }

        System.out.println("La paraula més curta és: " + min + " (" + min.length() + " lletres).");
    }
    private static void trobarLletraLongitud(String[] paraules, int longitud){
        boolean trobat = false;

        for (String p : paraules){
            if (p.length() == longitud){
                System.out.println("La paraula de longitud " + longitud + " que s'ha trobat és: " + p);
                trobat = true;
                break;
            }
        }
        if (!trobat){
            System.out.println("No s'ha trobat cap paraula de longitud " + longitud);
        }
    }
}
