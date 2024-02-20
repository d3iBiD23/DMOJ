package Examen;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String[] fila1 = sc.nextLine().split(" ");

        String[] fila2 = sc.nextLine().split(" ");

        int posicio = sc.nextInt();

        compararLinies(fila1, fila2, posicio);

        sc.close();

    }
    private static void compararLinies(String[] fila1, String[] fila2, int posicio){

        for (int i = 0; i < fila1.length; i++){
            if (fila1[posicio].charAt(0) == fila2[posicio].charAt(0)){
                System.out.println("La paraula a la posició " + posicio + " comença per la mateixa lletra a les dues línies.");
            }else {
                System.out.println("La paraula a la posició " + posicio + " comença per lletres diferents a les dues línies.");
            }
            if (fila1[i].equals(fila2[i])){
                System.out.println("Totes les paraules són les mateixes.");
            }else {
                System.out.println("Les paraules no són les mateixes.");
            }
            break;
        }
    }
}
