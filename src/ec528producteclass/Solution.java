package ec528producteclass;

import java.util.Scanner;
class Producte {
    String nom;
    String descripcio;
    float preu;
    int stock;
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Producte producte = new Producte();

        producte.nom = sc.nextLine();
        producte.descripcio = sc.nextLine();
        producte.preu = Float.parseFloat(sc.nextLine());
        producte.stock = sc.nextInt();

        System.out.println("Nom:        " + producte.nom);
        System.out.println("Descripcio: " + producte.descripcio);
        System.out.println("Preu:       " + producte.preu);
        System.out.println("Stock:      " + producte.stock);
    }
}
