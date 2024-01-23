package Paella;

import java.util.Locale;
import java.util.Scanner;

class Paella {
    private final float proporcioArroz;
    private final float proporcioGamba;
    private int comensales;
    private float precioKArroz;
    private float precioKGamba;

    public Paella(int comensales, float precioKArroz, float precioKGamba) {
        this.comensales = comensales;
        this.precioKArroz = precioKArroz;
        this.precioKGamba = precioKGamba;

        this.proporcioArroz = 4.0f / 0.5f;
        this.proporcioGamba = 4.0f / 0.25f;
    }

    public String calcularInfo() {
        float cantidadArroz = comensales / proporcioArroz;
        float cantidadGamba = comensales / proporcioGamba;
        float costeArroz = cantidadArroz * precioKArroz;
        float costeGamba = cantidadGamba * precioKGamba;
        float costeTotal = costeArroz + costeGamba;

        return  cantidadArroz + " kg arros\n" +
                cantidadGamba + " kg gambes\n" +
                costeArroz + " euros arros\n" +
                costeGamba + " euros gambes\n" +
                "TOTAL: " + costeTotal + " euros";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        Paella p = new Paella(sc.nextInt(), sc.nextFloat(), sc.nextFloat());

        System.out.println(p.calcularInfo());

        sc.close();
    }
}